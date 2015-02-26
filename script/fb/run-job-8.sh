hadoop jar jar/WorkGen.jar org.apache.hadoop.examples.WorkGen -conf conf/workGenKeyValue_conf.xsl -r 1 inputPath-job-8.txt workGenOutputTest-8 1.9103289E-5 0.79875195 >> logs/fb/job-8.txt 2>> logs/fb/job-8.txt 
hadoop dfs -rmr workGenOutputTest-8
# inputSize 67108864
