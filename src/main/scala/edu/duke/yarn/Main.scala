package edu.duke.yarn

import java.io._

// SparkConf
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.SQLContext
import java.sql.Date
object Main {

  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("E-Commerce")
    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)

    val wf = new Query(sc, sqlContext)
    wf.prepare()
    wf.run()

    sc.stop()
  }
}
