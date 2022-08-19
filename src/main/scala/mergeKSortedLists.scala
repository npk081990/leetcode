


object mergeKSortedLists {


  def merge2Lists(list1: ListNode, list2: ListNode): ListNode = {
    var head: ListNode = null
    var l1 = list1
    var l2 = list2
    if (l1 != null && l2 != null) {
      if (l1.x <=  l2.x) {
        head = l1
        l1 = l1.next
      } else {
        head = l2
        l2 = l2.next
      }
    } else if (l1 == null && l2 != null) {
      head = l2
      l2 = l2.next
    } else if (l1 != null && l2 == null) {
      head = l1
      l1 = l1.next
    } else if (l1 == null && l2 == null){
      return head
    }
    head.next = if(l1 != null || l2 != null) merge2Lists(l1, l2) else null

    head
  }


  def mergeKLists(lists: Array[ListNode]): ListNode = {
    if (lists.length == 0) return null

    var first: ListNode = lists(0)
    var second: ListNode = null
    for (iter <- 1 to lists.length-1) {
      second = lists(iter)

      first = merge2Lists(first, second)
    }

    first
  }

  def main(args: Array[String]): Unit = {

    var ret = mergeKLists(Array(
                              new ListNode(1, new ListNode(4, new ListNode(5))),
                              new ListNode(1, new ListNode(3, new ListNode(4))),
                              new ListNode(2, new ListNode(6))))


    // var ret = merge2Lists(new ListNode(1, new ListNode(2, new ListNode(3))), new ListNode(4, new ListNode(5)))
    while(ret !=null){
      println(ret.x)
      ret = ret.next
    }

  }
}