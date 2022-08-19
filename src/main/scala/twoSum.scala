


object twoSum {


  def main(args: Array[String]): Unit = {


    val nums = Array(-1,-2,-3,-4,-5)
    val target = -8
    val m = scala.collection.mutable.Map[Int, Int]()

    val ret = new Array[Int](2)
    for (i <- Range(0, nums.length)) {
      if (m.contains(nums(i))) {
        ret(0) = i
        ret(1) = m(nums(i))
      }
      m += (target-nums(i) -> i)
    }

    ret.foreach(println)

  }
}