hadoop jar jar/WorkGen.jar org.apache.hadoop.examples.WorkGen -conf conf/workGenKeyValue_conf.xsl -r 1 inputPath-job-5.txt workGenOutputTest-5 1.5258789E-5 48.03711 >> logs/fb/job-5.txt 2>> logs/fb/job-5.txt 
hadoop dfs -rmr workGenOutputTest-5
# inputSize 67108864
