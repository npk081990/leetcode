


object palindromeNumber {


  def main(args: Array[String]): Unit = {


    val x = -121

    if(x<0) return false
    val z = x.toString.toArray
    val n = z.length
    for (i <- 1 to n/2) {
      if (z(i-1) != z(n-i)) {
        return false
      }
    }
    true

  }
}