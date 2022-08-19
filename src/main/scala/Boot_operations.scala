


object Boot_operations {


  def main(args: Array[String]): Unit = {

    println("Hello Scala")

    val input = "111111111111111111111111111111111111111111111"

    var countOfOperations = 0
    for (elem <- input.toArray) {
      if (elem.toString.toInt == 1) {
        countOfOperations += 2
      } else if (elem.toString.toInt == 0) {
        countOfOperations += 1
      }
    }

    println("countOfOperations : " + countOfOperations)
  }
}