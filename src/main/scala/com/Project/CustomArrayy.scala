package com.Project

private class Arrayy[T: Manifest] (initialSize : Int = 10) {

  protected var arr: Array[T] = new Array[T](initialSize)
  protected var curr = 0
  protected var size = initialSize

  def add(a: T): Unit = {
    if (curr < arr.length) {
      arr(curr) = a
      curr += 1
    }
    else println("your current array is full please increase its size to use it again")
  }

  def printing() = {

    for(i <- 0 until(arr.length)){
      println(arr(i) )
    }

  }
}

  object Arrayy{

    def main(args: Array[String]): Unit = {

      val arr1 = new Custom[Int](5)
      arr1.add(10)
      arr1.add(20)
      arr1.add(30)
      arr1.add(40)


      arr1.printing()
    }
  }

class Custom[T: Manifest](initialSize : Int = 10) extends Arrayy[T](initialSize) {



//  def increase(): Unit ={
//    var temp : Array[T] = new Array[T](size*2)
//    arr.copyToArray(temp)
//    arr = temp
//
//  }

  override def add(item : T): Unit = {
    if(curr >= arr.length){
      var temp: Array[T] = new Array[T](size * 2)
      arr.copyToArray(temp)
      arr = temp
    }
    super.add(item)
  }

}


