hadoop jar jar/WorkGen.jar org.apache.hadoop.examples.WorkGen -conf conf/workGenKeyValue_conf.xsl -r 1 inputPath-job-12.txt workGenOutputTest-12 1.5258789E-5 1.0 >> logs/fb/job-12.txt 2>> logs/fb/job-12.txt 
hadoop dfs -rmr workGenOutputTest-12
# inputSize 67108864
