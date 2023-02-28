#!/bin/bash
#export HADOOP_HOME=/usr/hadoop
eval "sqoop export --verbose --connect jdbc:mysql://sample-db.cuy0rgqhle4s.ap-northeast-2.rds.amazonaws.com:3306/bsdb --username bit --password 1234 -m 1 --table board_recom --update-key user_nickname --update-mode allowinsert --export-dir hdfs://master:10000/input/sqoop/Gorani.csv --columns 'user_nickname,recom_board1,recom_board2,recom_board3,recom_board4,recom_board5,recom_board6,recom_board7,recom_board8,recom_board9,recom_board10,recom_board11,recom_board12,recom_board13,recom_board14,recom_board15,recom_board16,recom_board17,recom_board18,recom_board19,recom_board20'"
echo "sqoopex"
exit 0
