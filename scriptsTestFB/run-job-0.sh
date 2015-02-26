hadoop jar WorkGen.jar org.apache.hadoop.examples.WorkGen -conf /Users/shlee0605/bigdata/hadoop-2.6.0/etc/hadoop/workGenKeyValue_conf.xsl -r 1 inputPath-job-0.txt workGenOutputTest-0 0.00780648 1.0025139 >> workGenLogs/job-0.txt 2>> workGenLogs/job-0.txt
hadoop dfs -rmr workGenOutputTest-0
# inputSize 67108864
