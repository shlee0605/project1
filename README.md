Workflow for Project1
===============
Move data to the hdfs
```sh
hdfs dfs -copyFromLocal input/order.txt /e-commerce/order/order.txt
hdfs dfs -copyFromLocal input/item.txt /e-commerce/item/item.txt
```

Compile the code
```sh
sbt/sbt package
```

Submit this job to the yarn cluster
```sh
./run
```
