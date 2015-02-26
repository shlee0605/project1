hadoop jar jar/WorkGen.jar org.apache.hadoop.examples.WorkGen -conf conf/workGenKeyValue_conf.xsl -r 1 inputPath-job-32.txt workGenOutputTest-32 0.23994339 8.2155823E-4 >> logs/fb/job-32.txt 2>> logs/fb/job-32.txt 
hadoop dfs -rmr workGenOutputTest-32
# inputSize 67108864
