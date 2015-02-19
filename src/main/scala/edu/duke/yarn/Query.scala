package edu.duke.bigframe

import org.apache.spark.{ SparkConf, SparkContext }
import org.apache.spark.sql.hive.HiveContext

class WF_ReportSaleSentimentHive(context: HiveContext) {
  hc: hiveContext = context
  def prepare() {
    val itemPath = "hdfs://localhost:9000/e-commerce/order"
    val orderPath = "hdfs://localhost:9000/e-commerce/item"

    val dropOrder = "DROP TABLE order"
    val dropItem = "DROP TABLE item"

    hc.hql(dropOrder)
    hc.hql(dropItem)
  }

  def cleanUp() {
    hc.hql("DROP TABLE IF EXISTS order")
    hc.hql("DROP TABLE IF EXISTS item")
  }

  def run() {


  }
}
