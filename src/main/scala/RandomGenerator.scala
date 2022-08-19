import scala.collection.mutable._
import scala.util.Random

class RandomGenerator {
  private val values = ArrayBuffer[Int]()
  private val valuesMap = HashMap[Int, Int]()
  private val random = new Random()

  // Inserts an item x to the data structure if not already present.
  def insert(x: Int): Unit = {
    // check if its present in the valuesMap
    if (valuesMap.keys.exists(_ == x)) {
      return
    }
    values.addOne(x)
    valuesMap.addOne(x, values.length-1)
  }

  // Removes item x from the data structure if present.
  def remove(x: Int): Unit = {
    if (valuesMap.keys.exists(_ == x)) {
      val index = valuesMap(x)
      valuesMap.remove(x)

      // remove from the values arraylist
      if (index != values.length -1) {
        values(index) = values(values.length - 1) // last value now occupies the
        valuesMap(values(index)) = index
      }
      values.remove(values.length-1)

    }
  }

  // Searches an item x in the data structure
  def search(x: Int): Int = {
    if (valuesMap.keys.exists(_ == x)) {
      return valuesMap(x)
    }
    -1
  }

  // Returns a random element from current set of elements
  def getRandom(): Int = {
    if (values.length == 0) return -1
    values(random.between(0, values.length-1))
  }

}

object RandomGenerator {
  def main(args: Array[String]): Unit = {

    val r = new RandomGenerator
    r.insert(1)
    r.insert(2)
    r.insert(3)
    r.insert(4)
    r.insert(5)

    r.remove(5)

    println
    r.values.foreach(println)
    println
    r.valuesMap.foreach(println)



  }
}
