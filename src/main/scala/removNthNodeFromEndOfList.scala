


object removNthNodeFromEndOfList {


    def removeNthFromEnd(head: ListNode, n: Int): ListNode = {
      var cur = head
      var nthBeforeElement: ListNode = null
      var iter = 0
      var nthBeforeIter = iter - n - 1
      while (cur != null) {
        iter += 1
        nthBeforeIter = iter - n - 1
        if (nthBeforeIter > 0 && nthBeforeElement == null) {
          nthBeforeElement = head
        }
        cur = cur.next
        if(nthBeforeElement != null) nthBeforeElement = nthBeforeElement.next
      }
      if (nthBeforeIter==0) head.next = head.next.next
      if(nthBeforeIter < 0) if (head != null) return head.next else return null
      if (nthBeforeIter > 0 && nthBeforeElement != null) nthBeforeElement.next = nthBeforeElement.next.next

      head
    }


    def main(args: Array[String]): Unit = {
      // val head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))
      val head = new ListNode(1, new ListNode(2))
      var ret = removeNthFromEnd(head, 1)


      while (ret != null) {
        println(ret.x)
        ret = ret.next
      }


  }
}