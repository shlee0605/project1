#!/bin/bash

dmem=$1
emem=$2
QUEUE=$3

$SPARK_HOME/bin/spark-submit --class edu.duke.yarn.Scan \
    --master yarn-cluster \
    --num-executors 1 \
    --driver-memory $dmem \
    --executor-memory $emem  \
    --executor-cores 1 \
    --queue $QUEUE \
    /home/hadoop/project1/jar/interactive.jar
