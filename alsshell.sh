#!/bin/bash
export PYSPARK_PYTHON=/usr/bin/python3
export JAVA_HOME=/usr/java
export HADOOP_CONF_DIR=/usr/hadoop/etc/hadoop
SPARK_MASTER_HOST=10.0.2.100
SPARK_MASTER_PORT=7077
SPARK_MASTER_WEBUI_PORT=7000

eval "python3 /home/bit/01/testals.py"
echo "als"
exit 0
