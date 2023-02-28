#!/bin/bash
eval "flume-ng agent -f /home/bit/01/spool-to-hdfs.properties -n agent1 -c $FLUME_HOME/conf -Dflume.root.logger=INFO,console"

exit 0
