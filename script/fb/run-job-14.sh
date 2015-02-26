hadoop jar jar/WorkGen.jar org.apache.hadoop.examples.WorkGen -conf conf/workGenKeyValue_conf.xsl -r 1 inputPath-job-14.txt workGenOutputTest-14 1.5258789E-5 1.0 >> logs/fb/job-14.txt 2>> logs/fb/job-14.txt 
hadoop dfs -rmr workGenOutputTest-14
# inputSize 67108864
