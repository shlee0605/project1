hadoop jar jar/WorkGen.jar org.apache.hadoop.examples.WorkGen -conf conf/workGenKeyValue_conf.xsl -r 1 inputPath-job-4.txt workGenOutputTest-4 1.5258789E-5 1.0 >> logs/fb/job-4.txt 2>> logs/fb/job-4.txt 
hadoop dfs -rmr workGenOutputTest-4
# inputSize 67108864
