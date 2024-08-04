/*
 Write a Scala function called filterEvenNumbers that takes a list of integers as input and uses a
 lambda function to filter out the even numbers from the list. The function should return a new
 list containing only the even numbers.
 Example:
 Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 Output: [2, 4, 6, 8, 10]
 You can use the filter method on lists to implement the filterEvenNumbers function with a
 lambda function inside it.

*/

object q1 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = filterEvenNumbers(list)
    println(evenList)
  }

  def filterEvenNumbers(list: List[Int]): List[Int] = {
    list.filter(x => x % 2 == 0)
  }
}