package collectionAndMap

import scala.language.postfixOps

object MapAndAll {



  def main(args: Array[String]): Unit = {
    var map = Map(1 -> "pardium", 2 -> "dhankhar")
    map.foreach(print(_))
    map = map + (2 -> "pardium")
    map.foreach((x,y) => println(s"$x is rollno of $y"))
//    val anotehr = map + (1 -> "ilu")
  }
}
