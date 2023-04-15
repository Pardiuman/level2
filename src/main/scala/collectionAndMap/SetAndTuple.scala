package collectionAndMap

import scala.collection.mutable

object SetAndTuple {

  def main(args: Array[String]): Unit = {

    var set :mutable.HashSet[Int] = mutable.HashSet(1,2,3,4,5,5)   // basially this return a hashset that basically implememt the set trait behind the bars
    print(set)
    set = set.map(_*2)   // And we can appply all the methods like map, foreach,fold,reduce etc
    print(set)






  }

}
