


object findAllDuplicatesInAnArray {
// https://leetcode.com/problems/find-all-duplicates-in-an-arra

  def main(args: Array[String]): Unit = {

    val nums =  Array[Int](4,3,2,7,8,2,3,1)

    val s = scala.collection.mutable.Set[Int]()
    var dupS = List[Int]()
    for( num <- nums) {
      if(s.contains(num)) {
        dupS = dupS :+ num
      } else {
        s += num
      }
    }
    dupS


    dupS.foreach(println)
  }
}