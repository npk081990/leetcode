









object removeElement {

  def removeElement(nums: Array[Int], `val`: Int): Int = {

    import scala.util.control.Breaks._
    var i, iter, ret = 0
    while( i < nums.length) {
      if (nums(i) ==  `val`) {
        breakable {
          for (j <- Range(i + 1, nums.length)) {
            if (nums(j) != `val`) {
              nums(iter) = nums(j)
              ret += 1
              i = j
              break
            }
          }
        }
      } else {
        nums(iter) = nums(i)
        ret += 1
      }
      i += 1
      iter += 1

    }
    nums.foreach(println)
    ret
  }


  def main(args: Array[String]): Unit = {

    val ret = removeElement(Array(2), 3)
    println(ret)




  }
}