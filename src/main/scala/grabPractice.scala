
// you can write to stdout for debugging purposes, e.g.
// println("this is a debug message")

object SolutionGrabPractice {
  def solution(a: Array[Int]): Int = {
    // write your code in Scala 2.12
    import scala.util.control.Breaks._
    var index = 0
    for (i <- 0 to a.length-1) {
      if (a(i) > 0 && a(i) < a.length) {
        a(index) = a(i)
        index += 1
      }
    }

    for (i <- 0 to index-1) {
      val valAtI = a(i)
      val valAtVal = a(a(i)-1)

      a(i) = valAtVal
      a(valAtI-1) = valAtI
    }
    for (i <- 0 to index-1) { print(a(i) + " ")}

    var expectedValue = 1
    for (i <- 0 to index-1) {
      if (a(i) == expectedValue) {
        expectedValue += 1
      } else if (a(i) > expectedValue) {
        return expectedValue
      }
    }
    expectedValue

  }

  def main(args: Array[String]): Unit = {

    println("answer is : " + solution(Array(-1,-1,1000,6,5,3,2,5,1)))

    /*
    println("answer is : " + solution(Array(2,3,5,6)))
    println("answer is : " + solution(Array(1,3,5,6)))

    println("answer is : " + solution(Array(1,2,3,4)))
    */

  }

}
