#!/usr/bin/python3

import pymysql
import csv

con = pymysql.connect(host="10.0.2.100",user="bit",password="1234",db="bsdb", charset="utf8")


sql = "select * from board_recom"
cur = con.cursor()
cur.execute(sql)

file = open('/home/bit/01/Gorani.csv', 'r', encoding="utf-8")
rdr = csv.reader(file)

for line in rdr:
   print(line)

   #for row in cur :
   sql = "insert into board_recom(recom_board1, recom_board2,recom_board3,recom_board4,recom_board5, recom_board6,recom_board7,recom_board8,recom_board9, recom_board10,recom_board11,recom_board12,recom_board13, recom_board14,recom_board15,recom_board16,recom_board17,recom_board18, recom_board19,recom_board20, user_nickname) values (%s, %s, %s, %s, %s,%s, %s, %s, %s, %s, %s, %s, %s,%s, %s, %s, %s, %s, %s, %s, %s) on duplicate key update `user_nickname`=values(`user_nickname`), `recom_board1`=values(`recom_board1`), `recom_board2`=values(`recom_board2`),`recom_board3`=values(`recom_board3`),`recom_board4`=values(`recom_board4`),`recom_board5`=values(`recom_board5`), `recom_board6`=values(`recom_board6`),`recom_board7`=values(`recom_board7`),`recom_board8`=values(`recom_board8`),`recom_board9`=values(`recom_board9`), `recom_board10`=values(`recom_board10`),`recom_board11`=values(`recom_board11`),`recom_board12`=values(`recom_board12`),`recom_board13`=values(`recom_board13`), `recom_board14`=values(`recom_board14`),`recom_board15`=values(`recom_board15`),`recom_board16`=values(`recom_board16`),`recom_board17`=values(`recom_board17`),`recom_board18`=values(`recom_board18`),`recom_board19`=values(`recom_board19`),`recom_board20`=values(`recom_board20`)" 
   cur.execute(sql, (line[1], line[2],line[3], line[4], line[5], line[6],line[7], line[8], line[9], line[10],line[11], line[12], line[13], line[14],line[15], line[16], line[17], line[18],line[19], line[20],line[0]))
   con.commit()
   print("입력성공")
cur.close()
con.close()
