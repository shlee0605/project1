Workflow for Project1
===============
Download Spark-1.2.1 from [here](http://www.apache.org/dyn/closer.cgi/spark/spark-1.2.1/spark-1.2.1-bin-hadoop2.4.tgz)

Put Spark's /bin folder to the path

Move data to the hdfs
```sh
hdfs dfs -copyFromLocal input/order.txt /e-commerce/order/order.txt
hdfs dfs -copyFromLocal input/item.txt /e-commerce/item/item.txt
```

Prepare data for FB workload
```sh
./datagen_fb
```

Submit this job to the yarn cluster
```sh
./run
```
