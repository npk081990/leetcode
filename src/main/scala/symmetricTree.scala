


object symmetricTree {


  /**
   * Definition for a binary tree node.
   * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
   *   var value: Int = _value
   *   var left: TreeNode = _left
   *   var right: TreeNode = _right
   * }
   */
    def isSymmetric(root: TreeNode): Boolean = {

      var l = List[Int]()
      def inOrder(root: TreeNode): Unit = {
        if(root.left != null) inOrder(root.left)
        l = l :+ root.value
        if(root.right != null) inOrder(root.right)
      }

      l.foreach(println)

      var r = List[Int]()
      def inverseInOrder(root: TreeNode): Unit = {
        if(root.right != null) inOrder(root.right)
        r = r :+ root.value
        if(root.left != null) inOrder(root.left)
      }
      r.foreach(println)

      if (l.length != r.length) return false
      else {
        for (i <- Range(0, l.length)) {
          if (l(i) != r(i)) return false
        }
      }

      true

    }

  def main(args: Array[String]): Unit = {


    val r = isSymmetric(new TreeNode(1, new TreeNode(2, null, new TreeNode(3)), new TreeNode(2, null, new TreeNode(3))))

    println(r)


  }
}