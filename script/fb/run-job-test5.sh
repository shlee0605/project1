QUEUE=$1

hadoop jar /Users/shlee0605/bigdata/project1/jar/WorkGen.jar org.apache.hadoop.examples.WorkGen -Dmapred.job.queue.name=$QUEUE -conf /Users/shlee0605/bigdata/project1/conf/workGenKeyValue_conf.xsl -r 1 /Users/shlee0605/bigdata/project1/script/fb/inputPath-job-4.txt workGenOutputTest-4 1.5258789E-5 1.0
hadoop dfs -rmr workGenOutputTest-4
# inputSize 67108864
