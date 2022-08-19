import com.sun.media.sound.SoftLinearResampler2


object medianOfTwoSortedArrays {


  def main(args: Array[String]): Unit = {

    // https://leetcode.com/problems/median-of-two-sorted-arrays/

    val nums1: Array[Int] = Array(1,2,4)
    val nums2: Array[Int] = Array(3,4,5,7,8)


    val arr1Len = nums1.length; val arr2Len = nums2.length
    var arr1Ptr = if(arr1Len<1) -1 else 0; var arr2Ptr = if(arr2Len<1) -1 else 0;
    val mergeArrLen = arr1Len + arr2Len
    var mergeArr = List[Int]()
    for (i <- 1 to mergeArrLen) {
      if(arr1Ptr == -1 && arr2Ptr != -1) {
        mergeArr = mergeArr :+ nums2(arr2Ptr)
        if (arr2Ptr < arr2Len-1) arr2Ptr += 1 else arr2Ptr = -1
      }
      else if (arr2Ptr == -1 && arr1Ptr != -1) {
        mergeArr = mergeArr :+ nums1(arr1Ptr)
        if (arr1Ptr < arr1Len-1) arr1Ptr += 1 else arr1Ptr = -1
      }
      else if (nums1(arr1Ptr) <= nums2(arr2Ptr)) {
        mergeArr = mergeArr :+ nums1(arr1Ptr)
        if (arr1Ptr < arr1Len-1) arr1Ptr += 1 else arr1Ptr = -1
      }
      else {
        mergeArr = mergeArr :+ nums2(arr2Ptr)
        if (arr2Ptr < arr2Len-1) arr2Ptr += 1 else arr2Ptr = -1

      }
    }
    var median: Double = 0
    if (mergeArrLen > 0 && mergeArrLen % 2 == 0) {
      median = (mergeArr(mergeArrLen/2).toDouble + mergeArr(mergeArrLen/2-1).toDouble)/2
    } else if (mergeArrLen > 0) {
      median = mergeArr(mergeArrLen/2).toDouble
    }
    median



    println("median is : " + median)


  }
}