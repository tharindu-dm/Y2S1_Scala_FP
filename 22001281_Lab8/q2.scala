/*
*  "Multiple of Both Three and Five".
*/

object q2 {
  def main(args: Array[String]): Unit = {
    val input = args(0).toInt
    val multipleOfThree = (x: Int) => x % 3 == 0
    val multipleOfFive = (x: Int) => x % 5 == 0

    input match {
      case x if multipleOfThree(x) && multipleOfFive(x) => println("Multiple of Both Three and Five")
      case x if multipleOfThree(x) => println("Multiple of Three")
      case x if multipleOfFive(x) => println("Multiple of Five")
      case _ => println("Not a Multiple of Three or Five")
    }
  }
}