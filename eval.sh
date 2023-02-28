#!/bin/bash
str="ls -al eval.sh"
echo $str
eval $str
echo "ls -al" + "/"
eval "ls -al" + "/"

exit 0
