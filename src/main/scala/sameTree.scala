




object sameTree {

  def isSameTree(p: TreeNode, q: TreeNode): Boolean = {
    if ((p == null && q != null) || (p != null && q == null)) {
      return false
    } else {
      if(p != null && q != null) {
        if (p.value != q.value) return false
        else {
          if (isSameTree(p.left, q.left) == true) {
            return isSameTree(p.right, q.right)
          } else return false
        }
      }
    }
    true
  }


  def main(args: Array[String]): Unit = {

    // val p = new TreeNode(1, new TreeNode(2, new TreeNode(4)), new TreeNode(3, null, new TreeNode(5)))
    // val q = new TreeNode(1, new TreeNode(2, new TreeNode(4)), new TreeNode(3, null, new TreeNode(5)))
    val p = new TreeNode(10, new TreeNode(5), new TreeNode(15))
    val q = new TreeNode(10, new TreeNode(5, null, new TreeNode(15)))
    val ret = isSameTree(p, q)
    println("ret is : " + ret)
  }
}