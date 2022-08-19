



object Boot_bulb {


  def main(args: Array[String]): Unit = {

    println("Hello Scala")

    val input = Array(10,2,3,4,5,6,7,8,1,9)

    var moments = 0
    var currentMaxIndex = 0
    var turnedOnLights = 0
    for (i<-input) {
      turnedOnLights += 1
      if (currentMaxIndex < i) {
        currentMaxIndex = i
      }
      if (currentMaxIndex ==  turnedOnLights) {
        moments += 1
      }
    }
    println("moments : " + moments)
  }
}