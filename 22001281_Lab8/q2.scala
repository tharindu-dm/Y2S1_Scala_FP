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
