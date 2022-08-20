import cats.implicits._
import cats.kernel.Monoid

object scalaExamples {


  def main(args: Array[String]): Unit = {

    // flatmap
    println("flatMap")
    val l = List(1, 2, 3)
    println(l.map(x => List(x, x)))
    println(l.flatMap(x => List(x, x)))
    println("end - flatMap")
    
    // adding two functions 
    println("adding two functions")
    def func1(x: Int): Int = x+1
    def func2(x: Int): Int = x+2

    def func3 = func1 _ andThen func2 _
    println(List(1,2,3).map(func3))
    println("end - adding two functions")

    // foldLeft 
    println("foldLeft")
    abstract class rule {
      def apply(l: List[Int]): List[Int]
    }
    class rule1 extends rule {
      def apply(l: List[Int]): List[Int] = l.map(x => x+1)
    }
    class rule2 extends rule {
      def apply(l: List[Int]): List[Int] = l.map(x => x+2)
    }
    val listOfRules = List(new rule1, new rule2)
    println(listOfRules.foldLeft(l)((curr, rule) => rule.apply(curr)))
    println("end - foldLeft")

    
    // monoids - list monoid
    println("monoid")
    val listMonoid = new Monoid[List[Int]] {
      def empty: List[Int] = List.empty[Int]
      def combine(x: List[Int], y: List[Int]): List[Int] = x ++ y
    }
    println(listMonoid.combineAll(List(List(1,2,3), List(5,6,7), List(10, 11, 12))))
    println("end - monoid")

    // 


  
      
    



    
  }
}