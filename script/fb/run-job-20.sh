hadoop jar jar/WorkGen.jar org.apache.hadoop.examples.WorkGen -conf conf/workGenKeyValue_conf.xsl -r 1 inputPath-job-20.txt workGenOutputTest-20 0.20449321 3.9509428E-4 >> logs/fb/job-20.txt 2>> logs/fb/job-20.txt 
hadoop dfs -rmr workGenOutputTest-20
# inputSize 67108864
