


object sum3 {


  def main(args: Array[String]): Unit = {


    val nums = Array(-1,0,1,2,-1,-4)
    // val nums = Array(1,2,-2, -1)

    val numsLength = nums.length
    val sortedNumbers = nums.sorted
    import scala.collection.mutable.ListBuffer
    import scala.util.control.Breaks._
    val ret = ListBuffer[List[Int]]()
    var prev_first: Int = 9999999
    for (i<- Range(0, numsLength)) {
      val first = sortedNumbers(i)
      if (first != prev_first) {
        var prev_second: Int = 9999999
        for (j <- Range(i+1, numsLength)) {
          val second = sortedNumbers(j)
          if (second != prev_second) {
            var prev_third: Int = 9999999
            val expected_third = -1 * (first + second)
            breakable {
              for (k <- Range(j+1, numsLength)){
                val third = sortedNumbers(k)
                if (third != prev_third) {
                  if(third > expected_third) break
                  if (expected_third == third) {
                    ret.addOne(List(first, second, third))
                    break
                  }
                }
                prev_third = third
              }
            }
          }
          prev_second = second
        }
      }
      prev_first = first
    }
    ret.toList



    for (elem <- ret) {
      elem.foreach(print)
      println
    }

  }
}