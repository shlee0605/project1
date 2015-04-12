QUEUE=$1

hadoop jar /Users/shlee0605/bigdata/project1/jar/WorkGen.jar org.apache.hadoop.examples.WorkGen -Dmapred.job.queue.name=$QUEUE -conf /Users/shlee0605/bigdata/project1/conf/workGenKeyValue_conf.xsl -r 1 /Users/shlee0605/bigdata/project1/script/fb/inputPath-job-3.txt workGenOutputTest-3 4.427135E-5 0.39279705
hadoop dfs -rmr workGenOutputTest-3
# inputSize 67108864
