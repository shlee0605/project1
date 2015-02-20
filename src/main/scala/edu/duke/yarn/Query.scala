package edu.duke.yarn

import org.apache.spark.{ SparkConf, SparkContext }
import org.apache.spark.sql.hive.HiveContext

import org.apache.spark.sql.SQLContext
import java.sql.Date

//define schema
case class Order(order_id: toInt, buyer_id: Int, create_dt: Date)
case class Item(item_id: Int, order_id: Long, goods_id: Int, goods_number: Int, goods_price: Float, goods_amount: Float)

class Query(sc: SparkContext, sqlContext: SQLContext) {
  //prepare the table before run the queries
  def prepare() {
    import sqlContext._

    val orderPath = "hdfs://localhost:9000/e-commerce/order"
    val itemPath = "hdfs://localhost:9000/e-commerce/item"

    val order = sc.textFile(orderPath).map(_.split("\\|")).map(o => Order(o(0).trim.toInt, o(1).trim.toInt, Date.valueOf(o(2))))
    order.registerTempTable("orders")

    val item = sc.textFile(itemPath).map(_.split("\\|")).map(o => Item(o(0).trim.toInt, o(1).trim.toLong, o(2).trim.toInt, o(3).trim.toInt, o(4).trim.toFloat, o(5).trim.toFloat))
    item.registerTempTable("items")

  }

  //run e-commerce queries
  def runQuery() {

    val scan = sqlContext.sql("select goods_price,goods_amount from items where goods_amount > 224000 limit 10")
    val aggregation = sqlContext.sql("select goods_id, sum(goods_number) from items group by goods_id limit 10")
    val join = sqlContext.sql("select orders.buyer_id, sum(items.goods_amount) as total from items join orders on items.order_id = orders.order_id group by orders.buyer_id")

    scan.collect().foreach(println)
    aggregation.collect().foreach(println)
    join.collect().foreach(println)
  }
}
