object InventoryManagement extends App {
  var items = Array("apple", "banana", "orange", "grapes", "mango")
  var quantities = Array(10, 20, 30, 40, 50)

  def displayInventory(): Unit = {
    for (i <- items.indices) { 
      println(s"${items(i)} : ${quantities(i)}") //
    }
    println()
  }

  def restockItem(item: String, quantity: Int): Unit = {
    val index = items.indexOf(item)
    if (index != -1) {
      quantities(index) += quantity
    } else {
      println(s"$item does not exist in the inventory")
    }
  }

  def sellItem(item: String, quantity: Int): Unit = {
    val index = items.indexOf(item)
    if (index != -1) {
      if (quantities(index) >= quantity) {
        quantities(index) -= quantity
      } else {
        println(s"Not enough quantity of $item to sell")
      }
    } else {
      println(s"$item does not exist in the inventory")
    }
  }

  displayInventory()
  restockItem("apple", 5)
  displayInventory()
  sellItem("banana", 10)
  displayInventory()
  sellItem("banana", 15)
  displayInventory()
  sellItem("grapes", 50)
  displayInventory()
  restockItem("mango", 100)
  displayInventory()
}