package com.collection

import scala.collection.mutable.{ArrayBuffer, ListBuffer}
import scala.io.StdIn
import scala.language.postfixOps
import scala.util.Random

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
    println(list.contains(5))
    list = list :+ 10  // we can do this with the help of list.appended.
    list  = list.updated(5,6)
    println(list)  // list is immutable so we cannot add or remove elements in list, However if we want so
                   // so we have to do it explicitly with :+ and reference this with old list.

    list = list.appendedAll(List(7,8,9))
    println(list)

    list = list.map(_*2)  //map function return a new list with the result

    val rsult = list.reduce(_+_)
    println("here is the reduce result:- "+ rsult)

    list = list.filter(_%2==0)
    println(list.toList)


    val listBuff = ListBuffer(1,2,3,4) // it lets us to modify the list without making another one.
    listBuff+=5  // this will not make a new list rather modify the existing one.
    print("this is filtered one "+listBuff.filter(_%2 ==0))
    println()
    listBuff.foreach(print(_))

    println(listBuff.zip(List("a","b","c","d")))  // zip fucntion basically join two lists and return a new one having both content in pair

    val name : List[String] = List("p","a","r","d","i","u","m")
    println("here is reduced result of name list :- "+name.reduce(_+_))  // reduce is basically takes an element from list and perform operation on it then on second and add them

    val result=listBuff.partition(_<3)  // partition basically divides in two as per given condition
    println(result)

    println(name.find(x => x == "r"))  // return result as some

    println(listBuff.dropWhile(x=>x<5))  //dropwhile drop the element as per given condition but when its disturbed in between its get over there only.

    //flat and flatmap is same with slight differnet we can flat the collections while using extra map function inside it
    val flat = List(List(1,2,3,4,5),List(6,7,8,9))
    println(flat.flatMap(_.map(_*2)))


    var ans = (1 to 1000).toList
    println(ans)



    /*
      real life example for List
      like music player, we can add the songfs into playlist
    */
    val music = List("first_song","second_song","third_song","fourth_song","fifth_song","sixth_song")
    var random = Random.nextInt(music.length)
    val shuffle = (add:List[String]) => {
      var index = Random.nextInt(music.length)
      println(music(index))
    }
    println("shuffle the song")
    shuffle(music)




  }

}
