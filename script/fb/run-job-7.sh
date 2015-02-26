hadoop jar jar/WorkGen.jar org.apache.hadoop.examples.WorkGen -conf conf/workGenKeyValue_conf.xsl -r 1 inputPath-job-7.txt workGenOutputTest-7 1.5258789E-5 2.6914062 >> logs/fb/job-7.txt 2>> logs/fb/job-7.txt 
hadoop dfs -rmr workGenOutputTest-7
# inputSize 67108864
