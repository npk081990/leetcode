


object binarySearch {


  def main(args: Array[String]): Unit = {

    val nums = Array[Int](0)
    val target = 0

    var ret = -1
    val l = nums.length
    import scala.util.control.Breaks._
    breakable {
      var first = 0
      var last = l -1
      if(l > 0) {
        while (last >= first) {
          val half =  first + (last - first)/2
          if (nums(half) < target ) {
            first = half + 1
          } else if (nums(half) > target) {
            last = half - 1
          } else if (nums(half) == target) {
            ret = half
            break
          }
        }
      }
    }
    ret


    println(ret)
  }
}