hadoop jar jar/WorkGen.jar org.apache.hadoop.examples.WorkGen -conf conf/workGenKeyValue_conf.xsl -r 1 inputPath-job-34.txt workGenOutputTest-34 1.5258789E-5 1.0 >> logs/fb/job-34.txt 2>> logs/fb/job-34.txt 
hadoop dfs -rmr workGenOutputTest-34
# inputSize 67108864
