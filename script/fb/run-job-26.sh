hadoop jar jar/WorkGen.jar org.apache.hadoop.examples.WorkGen -conf conf/workGenKeyValue_conf.xsl -r 1 inputPath-job-26.txt workGenOutputTest-26 0.0033375323 1.600251 >> logs/fb/job-26.txt 2>> logs/fb/job-26.txt 
hadoop dfs -rmr workGenOutputTest-26
# inputSize 67108864
