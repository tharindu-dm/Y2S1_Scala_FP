/*
*  Write a Scala program that takes an integer input from the command line. Based on the
 input, use pattern matching to categorize the number and print the corresponding message.
 Implement the following logic using lambda functions:
 ● Iftheinput is a multiple of 3, print "Multiple of Three".
 ● Iftheinput is a multiple of 5, print "Multiple of Five".
 ● Iftheinput is a multiple of both 3 and 5, print "Multiple of Both Three and Five".
 ● Iftheinput is none of the above, print "Not a Multiple of Three or Five".
* */

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