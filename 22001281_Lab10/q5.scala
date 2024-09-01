/* 
Write a Scala function called countLetterOccurrences that takes a list of words as input
and uses the map function to transform the words into their respective lengths (number
of letters), and then uses the reduce function to calculate the total count of letter
occurrences in all the words combined.
Example: Input: ["apple", "banana", "cherry", "date"]
Output: Total count of letter occurrences: 21
Implement the countLetterOccurrences function using the map and reduce methods.
 */

object q5 {
  def main(args: Array[String]): Unit = {
    val words = List("apple", "banana", "cherry", "date")
    val total = countLetterOccurrences(words)
    println("Total count of letter occurrences: " + total)
  }

  def countLetterOccurrences(words: List[String]): Int = {
    words.map(_.length).reduce(_ + _)
  }
}