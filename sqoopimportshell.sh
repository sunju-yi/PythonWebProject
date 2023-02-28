#!/bin/bash
eval "sqoop import --connect jdbc:mysql://sample-db.cuy0rgqhle4s.ap-northeast-2.rds.amazonaws.com:3306/bsdb --username admin --password admin1234 --m 1 --table board --target-dir hdfs://master:10000/input/board"
echo "sqoopimport"
exit 0
