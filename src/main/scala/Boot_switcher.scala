


object Boot_switcher {


  def main(args: Array[String]): Unit = {

    println("Hello Scala")


    val n=99999
    var numberOfTurnedOnBulbs = 0

    for (i <- 1 to n) { // iterating for each bulb
      var operations = 1

      if (i >= 2){
        for(j <- 2 to i) { // iterating for each  operation
          if (i % j == 0) operations +=1
        }
      }
      if (operations % 2 != 0) numberOfTurnedOnBulbs += 1

    }
    numberOfTurnedOnBulbs


  }
}