


object removeDuplicatesFromSortedArray {

  def removeDuplicates(nums: Array[Int]): Int = {

    nums.distinct.length
  }


  def main(args: Array[String]): Unit = {


    val ret = removeDuplicates(Array(0,0,1,1,1,2,2,3,3,4))
    print(ret)
  }
}