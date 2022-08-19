


object mergeTwoSortedLists {
  /**
   * Definition for singly-linked list.
   * class ListNode(_x: Int = 0, _next: ListNode = null) {
   *   var next: ListNode = _next
   *   var x: Int = _x
   * }
   */
  def mergeTwoLists(list1: ListNode, list2: ListNode): ListNode = {

    var l1 = list1; var l2 = list2
    var head: ListNode = null

    // 1. Compare the two input ListNodes and get the lowest and make it as the head.
    // 2. Once the head is set to either l1 or l2, move the resp ListNode( l1 or l2) to point to the next node
    if (l1 != null && l2 != null) {
      if (l1.x <= l2.x) {
        head = l1
        l1 = l1.next
      } else {
        head = l2
        l2 = l2.next
      }
    } else if (l1 != null || l2 != null) {
      if (l1 == null) {
        head = l2
        l2 = l2.next
      } else {
        head = l1
        l1 = l1.next
      }
    }

    // 3. recursively call mergeTwoLists by passing the next two nodes to compare
    if (head !=null) head.next = if (l1 !=null || l2 != null) mergeTwoLists(l1, l2) else null

    // 4. Finally, return the head!
    head

  }

  def main(args: Array[String]): Unit = {

    val list1 =   new ListNode(1, new ListNode(2, new ListNode(4)))
    val list2 = new ListNode(1, new ListNode(3, new ListNode(4)))
    var ret = mergeTwoLists(list1, list2)

    while (ret != null) {
      println(ret.x)
      ret = ret.next
    }

  }
}