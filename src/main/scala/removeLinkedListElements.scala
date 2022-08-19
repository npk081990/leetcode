




object removeLinkedListElements {
  def removeElements(head: ListNode, `val`: Int): ListNode = {
    if (head == null) return null
    head.next = removeElements(head.next, `val`)
    if (head.x == `val`) return head.next
    else return head
  }


  def main(args: Array[String]): Unit = {


    val head = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))))
    val ret = removeElements(head, 6)


  }
}