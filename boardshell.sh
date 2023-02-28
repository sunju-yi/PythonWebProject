#!/bin/bash

eval "hdfs dfs -cat /input/board/part* | grep -E 'Music|Picture' | /home/bit/01/boardparsing.py"
echo "boardshell"
exit 0
