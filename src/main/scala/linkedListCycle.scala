


object linkedListCycle {




  def deleteNode(node: ListNode): Unit = {
      node.x = node.next.x
      node.next = node.next.next
  }


  def main(args: Array[String]): Unit = {

    val first = new ListNode(3)
    val second = new ListNode(2)
    val third = new ListNode(0)
    val fourth = new ListNode(-4, second)
    first.next = second
    second.next = third
    third.next = fourth

    var cur = first
    while (cur != null) {

    }

    deleteNode(first)
  }
}