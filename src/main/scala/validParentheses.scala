


object validParentheses {
  def isValid(s: String): Boolean = {

    if (s.length % 2 != 0) return false
    val openBraces = scala.collection.immutable.HashSet('(', '[', '{')
    val stack = new scala.collection.mutable.Stack[Char]
    for (elem <- s) {
      if (openBraces.contains(elem)) {
        stack.push(elem)
      }
      else {
        elem match {
          case ')' => if (stack.isEmpty || stack.pop != '(') return false
          case ']' => if (stack.isEmpty || stack.pop != '[') return false
          case '}' => if (stack.isEmpty || stack.pop != '{') return false

        }
      }
    }
    if (!stack.isEmpty) return false
    true

  }


  def main(args: Array[String]): Unit = {

    val s = "()"
    val ret = isValid(s)




    println(ret)
  }




}