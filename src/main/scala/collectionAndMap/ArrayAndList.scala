package collectionAndMap

import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn
import scala.language.postfixOps

object ArrayAndList {

  def main(args: Array[String]): Unit = {

    val arr = Array(1,2,3,4,5)  //create array
    arr(0) = 10  // update the value at 0th position

    var arr2 = arr  // arr2 reference to the arr
    arr2(0) = 20   // when we try to update the oth index of arr2 it changes the element in the original array
    var arr3 = arr.clone()  // it clones the original array and refernece to arr3


    println(arr2(0))
    arr.foreach(println(_))   // applies println function to each element in array
    val temp = arr2.map(x => x *2)  //applies a function to each ellemnt in array and returns an array that stores in temp
    arr2.foreach(print(_))
    println("reduced version of arr"+arr.reduce((x,y) => x+y))  // reduce actualy applies binary opration return a single result

    /*
    val dimArr = Array.ofDim[Int](2,2)
    for (i <- 0 until(dimArr.length) ; j <- 0 until (dimArr(i).length)) {
        print("enter the number for ("+ i+" )("+j+" )")
        dimArr(i)(j) = StdIn.readInt()
      }
    dimArr.foreach(print(_)) //  here we implement multidimensional array using Array.ofDim and takes the
                             //  value of array from user using readint()

    */




    val arrBuffer = ArrayBuffer(1,2,3,4)  // this is ArrayBuffer that provides us more functionality than array
    arrBuffer += 5
    println(arrBuffer)
    println(arrBuffer.remove(0))

    val tempArr = ArrayBuffer.empty[Int]
    println(tempArr)
//    tempArr = arrBuffer // we use val keyword that why we cannot reassign the refernce of temp arrBuffer


    var list = List(1,2,3,4,5)
    list = list :+ 10  // we can do this with the help of list.appended
    list  = list.updated(5,6)
    println(list)  // list is immutable so we cannot add or remove elements in list, However if we want so
                   // so we have to do it explicitly with :+ and reference this with old list



  }

}
