/**
  * Write a Scala function called calculateSquare that takes a list of integers as input and uses a
 lambda function to calculate the square of each number in the list. The function should return a
 newlist containing the squares of the input numbers in the same order.
 Example:
 Input: [1, 2, 3, 4, 5]
 Output: [1, 4, 9, 16, 25]
 You can use the map method onlists to implement the calculateSquare function with a lambda
 function inside it.
  */

object q2 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    val squareList = calculateSquare(list)
    println(squareList)
  }

  def calculateSquare(list: List[Int]): List[Int] = {
    list.map(x => x * x)
  }
}
