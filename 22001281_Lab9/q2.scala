/*
*  Write a program in PatternMatching, takes the integer input from the command line.
 Based on the input, write a code using match to print Negative/Zero is input when input is
 less than or equal to 0. Print Even number is given when input is even, and print Odd
 number is given when input is odd. (Hint: Use Lambda functions)
*/

object q2 {
  def main(args: Array[String]): Unit = {
    val input = args(0).toInt
    val result = input match {
      case x if x <= 0 => "Negative/Zero is input"
      case x if x % 2 == 0 => "Even number is given"
      case x if x % 2 != 0 => "Odd number is given"
    }
    println(result)
  }
}