hadoop jar jar/WorkGen.jar org.apache.hadoop.examples.WorkGen -conf conf/workGenKeyValue_conf.xsl -r 1 inputPath-job-25.txt workGenOutputTest-25 1.5258789E-5 1.0 >> logs/fb/job-25.txt 2>> logs/fb/job-25.txt 
hadoop dfs -rmr workGenOutputTest-25
# inputSize 67108864
