


object sqrt {
  def mySqrt(x: Int): Int = {

    if (x == 0 || x== 1) return x
    for (i <- 2 to x) {
      val sq = i*i
       if (sq > x || sq < 0)  return i -1
    }
    0
  }


  def main(args: Array[String]): Unit = {


    val ret = mySqrt(2147483647)

    println(ret)




  }
}