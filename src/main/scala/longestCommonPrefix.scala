


object longestCommonPrefix {

  def longestCommonPrefix(strs: Array[String]): String = {
    val minLength = strs.map(x => x.length).min

    var ret = ""
    scala.util.control.Breaks.breakable {
      for (i <- Range(0, minLength)) {
        if(strs.map(x => x(i)).distinct.length == 1)
          ret = ret + strs(0)(i)
        else
          scala.util.control.Breaks.break
      }
    }
    ret
  }

  def main(args: Array[String]): Unit = {


    // val ret = longestCommonPrefix(Array("flower","flow","flight"))
    val ret = longestCommonPrefix(Array("cir","car"))

    println(ret)

  }
}