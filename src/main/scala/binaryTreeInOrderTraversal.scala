import javax.swing.tree.TreeNode

class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
  var value: Int = _value
  var left: TreeNode = _left
  var right: TreeNode = _right
}

object binaryTreeInOrderTraversal {

  def inorderTraversal(root: TreeNode): List[Int] = {
    import scala.collection.mutable.ListBuffer
    val l = ListBuffer[Int]()
    if (root != null) {
      inorder(root)
      def inorder(root: TreeNode): Unit ={
        if (root.left != null) inorder(root.left)
        l.addOne(root.value)
        if (root.right != null) inorder(root.right)
      }
    }
    l.toList
  }

  def main(args: Array[String]): Unit = {


    // val root: TreeNode =  new TreeNode(1, _left = null, _right = new TreeNode(2, _left = new TreeNode(3, null, null), _right = null))
    val root: TreeNode = null

    val l = inorderTraversal(root)

    println(l)

  }
}