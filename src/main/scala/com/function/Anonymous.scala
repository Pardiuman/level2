package com.function

import scala.compiletime.ops.double.+

object Anonymous {
  def main(args: Array[String]): Unit = {

    def +(a:Int, b:Int) = a+b    // this is a simple function that takes two arguments and add them
    def add(a:Int, b:Int) : Int = a+b  // this is also a simple function that returns sum of  a and b
    def sub(a:Int , b:Int):Int ={      // we need to use curly braces if more than one expression is exist
      val result = a-b
      result
    }
    sub(10,5)  // this is fully applied function
    var subtract = sub(10,_:Int)  // this is partially applied function means it gives another function subtract
    println(subtract(5))



    val deff = (x:Int) => println(x) // anonymous function
    deff(4)

    def math(x:Int , y:Int , f: (Int,Int) => Int) : Int = f(x,y)  // a function is a higher order function that takes function as a paramter or return a function
    val addition = math(10,20,(_+_))
    println(addition)

    def math2(x : Int , y : Int , z : Int ,  f: (Int,Int) => Int) :Int = f(f(x,y),z)
    val multiply = math2(2,2,2,(x,y) => x*y)  // this is same as (_*_)
    println(multiply)


    var anonymous = (x:Int ,y:Int) => x/y
    def divide (x:Int,y:Int,f:(Int,Int) => Int) = f(x,y)

    print(divide(10,2,anonymous))  // we can pass anonymous function into the function rather than writing logic there

  }

}
