hadoop jar jar/WorkGen.jar org.apache.hadoop.examples.WorkGen -conf conf/workGenKeyValue_conf.xsl -r 1 inputPath-job-17.txt workGenOutputTest-17 1.5258789E-5 1.0 >> logs/fb/job-17.txt 2>> logs/fb/job-17.txt 
hadoop dfs -rmr workGenOutputTest-17
# inputSize 67108864
