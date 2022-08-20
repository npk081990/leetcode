

object zigzagConversion {


  def main(args: Array[String]): Unit = {


      val s = "PAYPALISHIRING"
      val numRows = 3

      var strings = new Array[String](numRows).map(x => "")

      var start = 0; val  lengthOfCycle = numRows + numRows - 2
      for (letter <- s.toArray){
        start += 1
        if (start <= numRows)
          strings(start-1) += letter
        else {
          strings(numRows - (start - numRows) - 1) += letter
        }
        if(start >= (lengthOfCycle))  start = 0
      }

      var returnString = ""
      strings.foreach(returnString += _)

      returnString

  }
}