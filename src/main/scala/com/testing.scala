package com

import scala.collection.LinearSeq

object testing {

  @main def other(): Unit = {

    var range = (1 to 100)
    var it= range.iterator
    while(it.hasNext){
      println(it.next)
    }

    val seq = IndexedSeq(1,2,3,4,3,2)

    println(seq)

    var vector = Vector(2,3,34,34,23,54)
    println(vector)

    val lazzyList = LazyList(1,2,3,4,5,6)
    println(lazzyList(4))

  }

}
