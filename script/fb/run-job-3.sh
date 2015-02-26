hadoop jar jar/WorkGen.jar org.apache.hadoop.examples.WorkGen -conf conf/workGenKeyValue_conf.xsl -r 1 inputPath-job-3.txt workGenOutputTest-3 4.427135E-5 0.39279705 >> logs/fb/job-3.txt 2>> logs/fb/job-3.txt 
hadoop dfs -rmr workGenOutputTest-3
# inputSize 67108864
