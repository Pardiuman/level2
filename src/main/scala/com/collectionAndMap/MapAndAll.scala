package com.collectionAndMap

import scala.collection.immutable.ListMap
import scala.collection.mutable
import scala.io.StdIn
import scala.language.postfixOps

object MapAndAll {



  def main(args: Array[String]): Unit = {
    var map :mutable.HashMap[Int,String] = mutable.HashMap(1 -> "pardium", 2 -> "dhankhar")
    map.foreach(print(_))
    map = map + (2 -> "pardium")
    map.foreach((x,y) => println(s"$x is rollno of $y"))
//    val anotehr = map + (1 -> "ilu")

    var hm = mutable.HashMap(1 -> "pardium" , 2 -> "dhankhar")
    println(hm)

    println(map)


    /*
      this is real life example of map in which we can enter
      student roll no. with name through input user
    
    */
    var rollNo :Map[Int,String] = Map.empty   
//    var indexedSystem = rollNo.toIndexSeq
    for(i <- 0 until 10 ){
      print("enter roll no.:- ")
      var roll = StdIn.readInt()
      print("enter student name:- ")
      var name = StdIn.readLine()
      rollNo += (roll -> name)
    }
    println(rollNo)
    rollNo.foreach(println(_))
  }
}
