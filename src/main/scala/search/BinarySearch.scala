package search

object BinarySearch {

  val arr =Array(1,2,3,4,5,6,7,8,9)
  var start =0
  var end = arr.length-1

  def search(target:Int): Int = {


    while (start <= end) {

      val mid = (start + end) / 2


      if (target<arr(mid)){
        end = mid-1
      }
      if(target>arr(mid)){
        start = mid+1
      }
      else{
        print("smile we found what you want at th index :- ")
        return mid
      }

    }
    print("sad but it doesn't exist in this array")
    0
  }

  def main(args: Array[String]): Unit = {
    print(BinarySearch.search(5))
  }

}
