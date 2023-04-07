package collectionAndMap

object ArrayAndList {

  def main(args: Array[String]): Unit = {

    val arr = Array(1,2,3,4,5)
    arr(0) = 10

    var arr2 = arr
    arr

    arr.foreach(println(_))
  }

}
