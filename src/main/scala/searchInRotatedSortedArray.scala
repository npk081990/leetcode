


object searchInRotatedSortedArray {

  def search(nums: Array[Int], target: Int): Int = {
    var lo = 0
    var hi = nums.length - 1
    var mid: Int = 0

    while(lo < hi) {
      mid = (lo + hi)/2
      if (nums(mid) > nums(hi)) lo = mid + 1
      else hi = mid
    }


    println(lo)
    hi = nums.length - 1
    if (target >= nums(lo) && target <= nums(hi)) {
        lo = lo
        hi = hi
    } else {
      hi = if (lo-1 < 0 ) 0 else lo - 1
      lo = 0
    }

    while(lo < hi) {
      mid = (lo + hi)/2
      if (target > nums(mid)) {
        lo = mid + 1
      } else {
        hi = mid
      }
    }
    if(nums(lo) == target) lo else -1
  }

  def main(args: Array[String]): Unit = {

    val r = search(Array(4,5,6,7,0,1,2), 6)
    // val r = search(Array(3, 5, 1), 5)
    println(r)


  }
}