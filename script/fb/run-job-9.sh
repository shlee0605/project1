hadoop jar jar/WorkGen.jar org.apache.hadoop.examples.WorkGen -conf conf/workGenKeyValue_conf.xsl -r 1 inputPath-job-9.txt workGenOutputTest-9 1.9820035E-4 0.21058567 >> logs/fb/job-9.txt 2>> logs/fb/job-9.txt 
hadoop dfs -rmr workGenOutputTest-9
# inputSize 67108864
