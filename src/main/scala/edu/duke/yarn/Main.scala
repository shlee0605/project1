package edu.duke.yarn

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.SQLContext
import java.sql.Date

object Join {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("E-Commerce")
    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)

    val wf = new Query(sc, sqlContext)
    wf.prepare()
    wf.runJoin()

    sc.stop()
  }
}

object Aggregation {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("E-Commerce")
    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)

    val wf = new Query(sc, sqlContext)
    wf.prepare()
    wf.runAggregation()

    sc.stop()
  }
}

object Scan {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("E-Commerce")
    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)

    val wf = new Query(sc, sqlContext)
    wf.prepare()
    wf.runScan()

    sc.stop()
  }
}
