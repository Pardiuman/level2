package inbuiltFunctions

import math.Numeric.Implicits.infixNumericOps


object MapAndOthers {

  def main(args: Array[String]): Unit = {


    val names = List("pardium dhankhar", "hi there")
    val result = names.map(x => x.split(" "))
    result.foreach(println(_).toString)
    val numbers = List(List(1,2,3),List(4,5,6))
    val double = numbers.map(innerlist => innerlist.map(x => x*2))
    println(double)

    val result2 = numbers.flatMap(innerlist => innerlist.map(x => x*2))
    println(result2)

    val another = List(1,2,3,4,5,6,7)
    val ans= another.map(x => x*2)
    println(ans)

  }
}
