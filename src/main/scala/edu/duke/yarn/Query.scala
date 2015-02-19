package edu.duke.yarn

import org.apache.spark.{ SparkConf, SparkContext }
import org.apache.spark.sql.hive.HiveContext

class Query(hc: HiveContext) {
  def prepare() {
    val itemPath = "hdfs://localhost:9000/e-commerce/order"
    val orderPath = "hdfs://localhost:9000/e-commerce/item"

    val dropOrder = "DROP TABLE order"
    val dropItem = "DROP TABLE item"

    hc.hql(dropOrder)
    //hc.hql(dropItem)

    val createOrder = "create external table order" +
      "(" +
      "order_id int," +
      "buyer_id int," +
      "create_dt timestamp" +
      ")" +
      "row format delimited fields terminated by \'|\' " + "\n" +
      "location " + "\'" + itemPath + "\'"
    hc.hql(createOrder)
  }

  def cleanUp() {
    hc.hql("DROP TABLE IF EXISTS order")
    //hc.hql("DROP TABLE IF EXISTS item")
  }

  def run() {
    val results = hc.hql("select * from order limit 10")
    results.collect().foreach(println)
  }
}
