object q3 {
  def fibonacci(n: Int): Int = {
    if (n <= 1) {
      return n
    }
    return fibonacci(n - 1) + fibonacci(n - 2)
  }

  def printFibonacci(n: Int): Unit = {
    for (i <- 0 until n) {
      print(fibonacci(i) + " ")
    }
    println()
  }

  def main(args: Array[String]): Unit = {
    printFibonacci(10)
  }
}