import scala.util.Try


object reverseInteger {


  def main(args: Array[String]): Unit = {



    val x = -321

    var xString = x.toString
    var negative = 1
    if(x<0) {
      negative = -1
      xString = (-1*x).toString
    }
    val n = xString.length
    val returnVal = new Array[Char](n)

    val turnsToRunLoop = if(n%2==0) n/2 else n/2+1
    for (i <- 1 to turnsToRunLoop) {
      returnVal(i-1) = xString(n-i)
      returnVal(n-i) = xString(i-1)
    }


    Try(returnVal.mkString.toInt * negative).getOrElse(0)




  }
}