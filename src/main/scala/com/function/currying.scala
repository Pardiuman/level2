package com.function

object currying {

  def main(args: Array[String]): Unit = {


    def add(x:Int,y:Int):Int =  x+y
    val another = (10,20,_:Int)  //partially applied
    println(another(30))


    def subtract(a:Int)(b:Int) = a-b

    val result = subtract(10)_    //function currying
    println(result(5))

    val addition = (add _).curried  // we can make any function curried by using .curried on any function
    addition(1)
    println(addition(2))




    def curr(x: Int)(y: Int): Int = x + y
    var addOne = curr(1)_
    var addTwo = addOne(2)
    println(addTwo)
    
    



  }

}
