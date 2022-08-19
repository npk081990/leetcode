


object findAllNumberDisappearedInAnArray {
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

  def main(args: Array[String]): Unit = {
    val nums = Array(4,3,2,7,8,2,3,1)


    val nums2 = 1 to nums.length to Array
    for (elem <- nums) {
      nums2(elem-1) = -1
    }
    nums2.foreach(println)

    nums2.filter(_ != -1).toList



  }
}