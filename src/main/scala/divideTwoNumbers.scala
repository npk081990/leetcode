import scala.util.Try


object divideTwoNumbers {
  def divide(dividend: Int, divisor: Int): Int = {

    var ret = 0
    var divi: Long = if (dividend < 0)  -dividend.toLong else dividend
    var d: Long =  if (divisor < 0)  -divisor.toLong else divisor
    while (divi >= d) {
      ret += 1
      divi -= d
    }

    if ((dividend <0 && divisor <0) || (dividend >0 && divisor >0)) {
      ret = if (ret == Int.MinValue) Int.MaxValue else ret
      ret
    }
    else {
      -ret
    }
  }




  def main(args: Array[String]): Unit = {

    val ret = divide(-2147483648,1)

    println(ret)





  }
}