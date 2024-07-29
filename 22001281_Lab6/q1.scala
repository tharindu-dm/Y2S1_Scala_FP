object q1{
  case class Item(PID: Int, name: String, qty: Int, price: Float)
  var inventory1: Map[Int, Item] = Map()
  var inventory2: Map[Int, Item] = Map()

  def displayInventory(): Unit =
  {
    print("display which inventory? 1 or 2: ")
    val choice = scala.io.StdIn.readLine().toInt
    
    val inv = if (choice == 1) inventory1 else if (choice == 2) inventory2 else
    {
      println("Invalid choice")
      return
    }

    if (inv.nonEmpty)
    {
      for ((_, item) <- inv)
      {
        println(s"${item.PID}\t${item.name}\t${item.price}\t${item.qty}")
      }
    } else
    {
      println(s"Inventory $choice is empty")
    }
  }

  def findProduct(): Unit =
  {
    print("find product in which inventory? 1 or 2: ")
    val choice = scala.io.StdIn.readLine().toInt
    val inv = if (choice == 1) inventory1 else if (choice == 2) inventory2 else
    {
      println("Invalid choice")
      return
    }

    print("Enter PID: ")
    val pid = scala.io.StdIn.readLine().toInt

    inv.get(pid) match
    {
      case Some(item) => println(s"${item.PID}\t${item.name}\t${item.price}\t${item.qty}")
      case None => println(s"Item with PID: $pid not found")
    }
  }

  def checkInventory(): Unit =
  {
    print("check which inventory? 1 or 2: ")
    val choice = scala.io.StdIn.readLine().toInt

    val inv = if (choice == 1) inventory1 else if (choice == 2) inventory2 else
    {
      println("Invalid choice")
      return
    }

    println(s"Inventory $choice is ${if (inv.nonEmpty) "not " else ""}empty")
  }

  def mergeInventory(inv1: Map[Int, Item], inv2: Map[Int, Item]): Unit =
  {
    val mergedInventory = (inv1.keySet ++ inv2.keySet).map{ pid =>
      (inv1.get(pid), inv2.get(pid)) match
      {

        case (Some(item1), Some(item2)) =>
          val newPrice = if (item1.price > item2.price) item1.price else item2.price
          Item(pid, item1.name, item1.qty + item2.qty, newPrice)

        case (Some(item), None) => item

        case (None, Some(item)) => item

        case _ => throw new Exception("This should never happen")
      }
    }.toList

    for (item <- mergedInventory)
    {
      println(s"${item.PID}\t${item.name}\t${item.price}\t${item.qty}")
    }
  }

  def addProduct(inv: Map[Int, Item]): Map[Int, Item] =
  {
    print("Enter PID: ")
    val pid = scala.io.StdIn.readLine().toInt

    print("Enter name: ")
    val name = scala.io.StdIn.readLine()

    print("Enter quantity: ")
    val qty = scala.io.StdIn.readLine().toInt

    print("Enter price: ")
    val price = scala.io.StdIn.readLine().toFloat

    inv + (pid -> Item(pid, name, qty, price))
  }

  def main(args: Array[String]): Unit =
  {
    var input = "11"
    printf("%s", "01 - add item to inventory1\n02 - add item to inventory2\n1 - show all products\n2 - find a product\n3 - check inventory\n4 - merge inventory\nPress -1 to exit\n\n")
    while (input != "-1")
    {
      print("What do you want? ")
      input = scala.io.StdIn.readLine()

      input match
      {
        case "1" => displayInventory()
        case "2" => findProduct()
        case "3" => checkInventory()
        case "4" => mergeInventory(inventory1, inventory2)
        case "01" => inventory1 = addProduct(inventory1)
        case "02" => inventory2 = addProduct(inventory2)
        case "-1" => return
        case _ => println("Invalid input\n")
      }
    }
  }
}