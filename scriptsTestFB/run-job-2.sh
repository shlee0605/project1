hadoop jar WorkGen.jar org.apache.hadoop.examples.WorkGen -conf /Users/shlee0605/bigdata/hadoop-2.6.0/etc/hadoop/workGenKeyValue_conf.xsl -r 1 inputPath-job-2.txt workGenOutputTest-2 1.2668967E-4 0.25417548 >> workGenLogs/job-2.txt 2>> workGenLogs/job-2.txt 
hadoop dfs -rmr workGenOutputTest-2
# inputSize 67108864
