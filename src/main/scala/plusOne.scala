

object plusOne {
  def plusOne(digits: Array[Int]): Array[Int] = {
    var ret = Array[Int]()
    var carry = 0; var counter = 0
    for (i <- digits.length-1 to 0 by -1) {
      if (counter == 0) {
        // add 1
        if(digits(i) + 1 == 10) {
          ret = 0 +: ret
          carry = 1
        } else {
          ret = (digits(i) + 1) +: ret
        }
        counter +=1
      }
      else {
        // add carry
        if (digits(i) + carry == 10) {
          ret = 0 +: ret
          carry = 1
        }
        else {
          ret = (digits(i) + carry) +: ret
          carry = 0
        }
      }
    }
    if (carry != 0)  ret = carry +: ret

    ret
  }


  def main(args: Array[String]): Unit = {

    val l = plusOne(Array(9, 9, 9))
    l.foreach(println)

  }
}