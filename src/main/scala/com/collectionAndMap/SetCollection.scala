package com.collectionAndMap

import scala.collection.*
import scala.collection.immutable.ListSet

object SetCollection {

  def main(args: Array[String]): Unit = {

    var hashSet:immutable.HashSet[Int] = immutable.HashSet(1,2,3,4,5,4,3)    // immutable hashset
    println(hashSet)
    println(hashSet)

    val set = mutable.Set(1,2,3,4,5,4,3,6)    // mutable hashset and by the way if we cant give the compiler type of set automatically it makes the type of hashset
    println(set)

    val listSet = ListSet(1,2,3,4,5,6,5,4)    // it is a set which basically implemenetd as linked list and it maintain order of insertion
    println(listSet)

    val sortedSet = SortedSet(5,3,8,6,5,3,1,6,8,0)    // when we created sortedSet it automatically select the type of treeset
    println(sortedSet)

  }

}
