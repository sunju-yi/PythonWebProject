#!/bin/bash

eval "hdfs dfs -cat /input/flume/* | /home/bit/01/parsing.py"
echo "parsing"
exit 0
