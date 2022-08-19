


object containerWithMostWater {


  def main(args: Array[String]): Unit = {


    val height = Array(1,8,6,2,5,4,8,3,7)

    var maxArea = 0; var maxHeightOuter = 0
    for (i <- 1 to height.length) {
      val x=height(i-1);

      if (x > maxHeightOuter) {
        var maxheight = 0
        for (j <- height.length to i + 1 by -1) {
          val y = height(j - 1)
          if (y > maxheight) {
            val area = math.min(x, y) * (j - i)
            if (maxArea < area) maxArea = area
            maxheight = y
          }
        }
        maxHeightOuter = x
      }

    }
    maxArea

    print(maxArea)

  }
}