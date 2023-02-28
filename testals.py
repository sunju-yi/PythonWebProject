#!/usr/bin/python3
# als_pyspark.py


from pyspark.sql.session import SparkSession
from pyspark.sql.context import SQLContext
from pyspark.ml.feature import StringIndexer, IndexToString
from pyspark.ml.pipeline import Pipeline
from pyspark.ml.recommendation import ALS
from pyspark.ml.evaluation import RegressionEvaluator
from pyspark.sql.functions import col, desc
from pyspark.sql.types import StructType, StructField, IntegerType

import os
import sys
import pandas as pd
import csv
from pyspark.conf import SparkConf
from pyspark.context import SparkContext
os.environ['PYSPARK_PYTHON'] = sys.executable
os.environ['PYSPARK_DRIVER_PYTHON'] = sys.executable

conf= SparkConf().setAppName("test").setMaster("spark://master:7077")
#sc =SparkContext(conf=conf).getOrCreate(
sc =SparkContext().getOrCreate(conf=conf)
sqlContext = SQLContext(sc)


# spark = SparkSession.builder.appName( "test" ).master("spark://master:7077").getOrCreate()
business = sqlContext.read.json( "hdfs://master:10000/input/test/board.json" ) # read.text 나 csv 로 바꾸고 경로를 하둡 저장소 위치
review = sqlContext.read.json( "hdfs://master:10000/input/test/review.json" )
                            # .withColumnRenamed( "stars", "stars_restaurant" )
# business = business.filter( ( business["city"] == "Tampa" ) \
#                             & ( business.categories.contains( "Restaurants" ) ) ).drop( "city" )
review = review.join( business, on="board_id", how="inner" )

indexer = [StringIndexer(inputCol=column, outputCol=column+"_index") for column in ['nickname','board_id']]
pipeline = Pipeline(stages=indexer)
transformed = pipeline.fit( review ).transform( review )
# ( train, test ) = transformed.randomSplit( [0.8, 0.2], seed=0 ) # 훈련데이터와 테스트데이터 분류 8:2


# review.select(['user_nickname', 'board_id', 'rating']).show()

als = ALS(maxIter=1,
        regParam=0.09,
        rank=25,        
        userCol="nickname_index",
        itemCol="board_id_index",
        ratingCol="rating",
        coldStartStrategy="drop",
        nonnegative=True) # 학습되지 못한 데이터 처리 방법 
model = als.fit( transformed )

predictions =model.transform(transformed)

converter = IndexToString(inputCol="nickname_index", outputCol="original")
original_df = converter.transform(transformed)

topvalue=original_df.orderBy(original_df["nickname_index"].desc()).first()["nickname_index"]

topRecom=[]
for i in range(int(topvalue)):
    Gorani=[] # topRecom에 넣을 리스트
    test = model.recommendForAllUsers(20).filter( col('nickname_index') == i)\
        .select("recommendations").collect()
    neworiginal_df =original_df.filter(col("nickname_index")==i)
    selectneworiginal_df=str(neworiginal_df.select(col("original")).first()).split("'")[1]   
    Gorani.append(selectneworiginal_df)
    for j in test[0][0]:        
        Gorani.append(j.board_id_index)
    topRecom.append(Gorani)


columns = ["유저닉네임","n번쨰 추천게시물"]
restaurants = sqlContext.createDataFrame( data=topRecom ,schema=columns )
reCom=restaurants.toPandas()

reCom.to_csv("/home/bit/01/Gorani.csv",header=None,index=None)



                                                
                                                
                                                
                                                
                                                
                                                
                                                
                                                
                                                
                                                
                                                

