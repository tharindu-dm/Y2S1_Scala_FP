object q1 {
  def getProductList(): List[String] = {
    var productList: List[String] = List()
    var product: String = ""
    while (product != "done") {
      println("Enter product name: ")
      product = scala.io.StdIn.readLine()
      if (product != "done") {
        productList = productList :+ product
      }
    }
    return productList
  }

  def printProductList(productList: List[String]): Unit = {
    for ((product, index) <- productList.zipWithIndex) {
      println(s"${index + 1}. $product")
    }
  }

  def getTotalProducts(productList: List[String]): Int = {
    return productList.length
  }

  def main(args: Array[String]): Unit = {
    val productList = getProductList()
    printProductList(productList)
    println(s"Total number of products: ${getTotalProducts(productList)}")
  }
}