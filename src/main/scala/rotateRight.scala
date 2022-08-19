


object rotateRight {


  def rotateRight(head: ListNode, k: Int): ListNode = {

    if (head == null) return null
    if (head.next == null) return head

    var h = head
    var originalHead = head
    var ultimate: ListNode = null
    var penultimate: ListNode = null

    // get the number of rotations to be made
    var count = 0
    while (h != null) {
      println("count : " + count)
      count += 1
      h = h.next
    }

    // actual k determination
    val actualK = k % count

    // actual rotation
    h = head
    for(i <- 1 to actualK) {
        while (h != null) {
            if (h.next == null) {
                ultimate = h
            } else {
                penultimate = h
            }

            h = h.next
        }
        penultimate.next = null
        ultimate.next = originalHead
        originalHead = ultimate
        h = originalHead
    }

    h


  }


  def main(args: Array[String]): Unit = {

    var ret = rotateRight(new ListNode(1, new ListNode(2, new ListNode(3))), 2000000000)


    while (ret!= null) {
      println(ret.x)
      ret = ret.next
    }





  }
}