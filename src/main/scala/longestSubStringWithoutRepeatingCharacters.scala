


object longestSubStringWithoutRepeatingCharacters {


  def main(args: Array[String]): Unit = {

    val s:String = " "

    import scala.collection.mutable.Set
    import scala.util.control.Breaks._
    var l = 0
    for (i <- Range(0, s.length)) {
      var setElem = Set[String]()
      var c = 0
      breakable {
        for (j <- Range(i, s.length)) {
          if (setElem.contains(s(j).toString) || (s(j) == ' ' && setElem.contains("Space"))) {
            break
          } else {
            if (s(j) == ' ') setElem += "Space" else setElem = setElem += s(j).toString
            c += 1
          }
        }
      }
      if (c > l) l = c
    }
    l


    println(l)
  }
}