







object palindromeLinkedList {


  def isPalindrome(head: ListNode): Boolean = {

    import scala.collection.mutable.Stack
    val stack = new Stack[Int]
    var cur = head
    while (cur != null) {
      stack.push(cur.x)
      cur = cur.next
    }
    cur = head
    for (i <- 1 to stack.length/2) {
      val s = stack.pop
      if(s == cur.x) {
        cur = cur.next
      } else {
        return false
      }
    }
    true
  }




  def main(args: Array[String]): Unit = {
    val head = new ListNode(1, new ListNode(2))
    val ret = isPalindrome(head)



    println(ret)
  }
}