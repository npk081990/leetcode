


object integerToRoman {


  def main(args: Array[String]): Unit = {


    val num = 1994

    val M : Array[String] = Array("" , "M", "MM", "MMM")
    val C : Array[String] = Array("" , "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM")
    val X : Array[String] = Array("" , "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC")
    val I : Array[String] = Array("" , "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX")

    M(num/1000) + C((num%1000)/100) + X( ((num%1000)%100)/10 ) + I( ((num%1000)%100)%10 )

  }
}