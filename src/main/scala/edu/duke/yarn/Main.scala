package edu.duke.yarn

import java.io._

// Spark
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.hive.HiveContext


object Main {

  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("test")

    val sc = new SparkContext(conf)
    val hc = new HiveContext(sc)

    import hc._

    val wf = new Query(hc)
    wf.cleanUp()
    wf.prepare()
    wf.run()

    System.exit(0)
  }
}
