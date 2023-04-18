package com.concurrency
import scala.collection.parallel.CollectionConverters.*
import scala.collection.parallel.ParSeq
import scala.collection.parallel.mutable.{ParArray, ParArrayCombiner}
import scala.collection.parallel.*


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



    val arr  = ParArray[Int](1,2,3,4,5,6,7,8,9)
    println(arr)

    val map = ParMap[Int,Int](1 -> 1, 2->2 ,3 -> 3,4 -> 4, 5-> 5)
    println(map)


  }

}
