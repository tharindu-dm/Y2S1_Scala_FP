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
