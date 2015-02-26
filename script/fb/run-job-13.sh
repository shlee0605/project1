hadoop jar jar/WorkGen.jar org.apache.hadoop.examples.WorkGen -conf conf/workGenKeyValue_conf.xsl -r 1 inputPath-job-13.txt workGenOutputTest-13 1.733303E-4 0.08803301 >> logs/fb/job-13.txt 2>> logs/fb/job-13.txt 
hadoop dfs -rmr workGenOutputTest-13
# inputSize 67108864
