


object romanToInteger {


  def main(args: Array[String]): Unit = {


    val s = "MCMXCIV"

    val m = Map('I' -> 1, 'V' -> 5, 'X' -> 10, 'L' -> 50, 'C' -> 100, 'D' -> 500, 'M' -> 1000)
    var prevElem = ' '
    var i = 0

    for (j <- s.length to 1) {
      println(j)
    }
      for (j <- s.length to 1 by -1) {
      val currElem = s(j-1)
      var value = m(currElem)
      if ( (currElem == 'I' && (prevElem == 'V' || prevElem == 'X'))
        || (currElem == 'X' && (prevElem == 'L' || prevElem == 'C'))
        || (currElem == 'C' && (prevElem == 'D' || prevElem == 'M'))) value = value * -1

      i += value
      prevElem = currElem
    }
    i

    println(i)

  }
}