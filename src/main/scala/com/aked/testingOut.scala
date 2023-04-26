package com.aked

object testingOut {




  @main def anotherFunction(): Unit = {

    val arr = Array(1, 2, 3, 4, 5, 6, 7)
    var sum = 0

    for (i <- 0 until arr.length) {
      sum += arr(i)
    }
    println(sum)

  }

  def main(args: Array[String]): Unit = {

    def add(x:Int , y:Int, f:(Int,Int) => Int) = f(x,y)

    val first = add(10,20,(_+_))

    println(first)


  }

}
