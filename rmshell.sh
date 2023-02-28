#!/bin/bash
eval "rm -r /home/bit/01/*.json"
eval "rm -r /home/bit/01/Gorani.csv"
eval "rm -r /home/bit/01/flume/*"
eval "hdfs dfs -rm -r /input/board"

exit 0
