QUEUE=$1

hadoop jar /home/hadoop/project1/jar/WorkGen.jar org.apache.hadoop.examples.WorkGen -Dmapred.job.queue.name=$QUEUE -conf /home/hadoop/project1/conf/workGenKeyValue_conf.xsl -r 1 /home/hadoop/project1/script/fb/inputPath-job-0.txt workGenOutputTest-0 0.00780648 1.0025139
hadoop dfs -rmr workGenOutputTest-0
# inputSize 67108864
