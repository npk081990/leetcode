


object climbingStairs {
  def climbStairs(n: Int): Int = {
    if (n == 1 || n == 2) {
      return n
    }

    var prevPrev = 1
    var prev = 2
    var cur = 0
    for (n <- 3 to n) {
      cur = prev + prevPrev
      prevPrev = prev
      prev = cur
    }
    cur
  }


  def main(args: Array[String]): Unit = {

    val ret = climbStairs(10)

    println(ret)





  }
}