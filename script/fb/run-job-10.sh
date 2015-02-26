hadoop jar jar/WorkGen.jar org.apache.hadoop.examples.WorkGen -conf conf/workGenKeyValue_conf.xsl -r 1 inputPath-job-10.txt workGenOutputTest-10 1.7650425E-4 0.40869564 >> logs/fb/job-10.txt 2>> logs/fb/job-10.txt 
hadoop dfs -rmr workGenOutputTest-10
# inputSize 67108864
