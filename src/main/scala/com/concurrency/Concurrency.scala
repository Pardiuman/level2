package com.concurrency
import scala.collection.parallel.CollectionConverters._

object Concurrency {

  def main(args: Array[String]): Unit = {

    val list = (1 to 1000).toList
    val concurrent  =  list.par
    println(concurrent)
    val names = List("pardium","dhankhar","ilu","dhanhar","ronka","dalal","jaat").par
    val collect = concurrent.zip(names)
    println(collect)
    val reduceFunction = concurrent.reduce(_+_)
    println(reduceFunction)

    val result = concurrent.map((x) => x*2).filter(_ % 2 == 0).toList
    println(result)

  }

}
