package edu.duke.yarn

import java.io._

// SparkConf
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.hive.HiveContext


object Main {

  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("test").setMaster("local")
    conf.set("spark.executor.instances", "5")
    conf.set("spark.yarn.queue", "default")
    conf.setJars(Seq("target/scala-2.10/516-worflow-assembly-1.0.jar"))

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
