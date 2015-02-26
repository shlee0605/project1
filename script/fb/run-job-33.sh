hadoop jar jar/WorkGen.jar org.apache.hadoop.examples.WorkGen -conf conf/workGenKeyValue_conf.xsl -r 1 inputPath-job-33.txt workGenOutputTest-33 1.5258789E-5 1.0 >> logs/fb/job-33.txt 2>> logs/fb/job-33.txt 
hadoop dfs -rmr workGenOutputTest-33
# inputSize 67108864
