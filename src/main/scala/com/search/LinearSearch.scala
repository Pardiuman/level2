package com.search

object LinearSearch {

  def main(args: Array[String]): Unit = {


    val list = List("ilu","pardium","dhankhar","pardiuman")

    for(i <- 0 until(list.length)){
      if(list(i).equals("pardiuman") ){
        println("found")
        return true
      }
    }

  }

}
