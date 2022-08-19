
// Definition for singly-linked list.
class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x
}

object Solution {
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    var list1 = l1
    var list2 = l2

    var carryOver: Int = 0

    val firstListNode = new ListNode()
    var curListNode = firstListNode

    while(list1 != null || list2 != null || carryOver != 0) {
      var curElem: Int = (if (list1!=null) {list1.x} else{0}) + (if (list2!=null) {list2.x} else{0})
      curElem += carryOver
      var elemToAdd: Int = curElem
      if (curElem >= 10) {

        elemToAdd =  elemToAdd % 10
      }
      println(elemToAdd)
      val preparedListNode = new ListNode(elemToAdd)

      curListNode.next = preparedListNode
      curListNode = curListNode.next

      if (curElem >= 10) {
        carryOver =  1
      } else carryOver = 0

      list1 = if(list1 != null) list1.next else null
      list2 = if(list2 != null) list2.next else null
    }

    // return here
    firstListNode.next
  }


  def main(args: Array[String]): Unit = {
    val n1 = new ListNode(2)
    addTwoNumbers(new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))), new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))
  }
}