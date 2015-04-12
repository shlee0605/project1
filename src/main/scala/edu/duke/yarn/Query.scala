package edu.duke.yarn

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.SQLContext
import java.sql.Date

//define schema
case class Order(order_id: Int, buyer_id: Int, create_dt: Date)
case class Item(item_id: Int, order_id: Long, goods_id: Int, goods_number: Int, goods_price: Float, goods_amount: Float)

class Query(sc: SparkContext, sqlContext: SQLContext) {
  //prepare the table before run the queries
  def prepare(host: String) {
    import sqlContext.implicits._

    val orderPath = "hdfs://" + host + ":9000/e-commerce/order"
    val itemPath = "hdfs://" + host + ":9000/e-commerce/item"

    val order = sc.textFile(orderPath).map(_.split("\\|")).map(o => Order(o(0).trim.toInt, o(1).trim.toInt, Date.valueOf(o(2)))).toDF()
    order.registerTempTable("orders")

    val item = sc.textFile(itemPath).map(_.split("\\|")).map(o => Item(o(0).trim.toInt, o(1).trim.toLong, o(2).trim.toInt, o(3).trim.toInt, o(4).trim.toFloat, o(5).trim.toFloat)).toDF()
    item.registerTempTable("items")
  }

  //run e-commerce queries
  def runJoin() {
    val join = sqlContext.sql("select orders.buyer_id, sum(items.goods_amount) as total from items join orders on items.order_id = orders.order_id group by orders.buyer_id limit 10")
    join.saveAsTextFile("hdfs://localhost:9000/result-join")
  }

  def runScan() {
    val scan = sqlContext.sql("select goods_price,goods_amount from items where goods_amount > 224000")
    scan.saveAsTextFile("hdfs://localhost:9000/result-scan")
  }

  def runAggregation() {
    val aggregation = sqlContext.sql("select goods_id, sum(goods_number) from items group by goods_id")
  }
}
