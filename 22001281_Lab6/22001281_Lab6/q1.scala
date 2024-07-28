object q1 {
  case class Item(PID: Int, name: String, qty:Int, price:Float)
  var inventory1: Set[Item] = Set()
  var inventory2: Set[Item] = Set()

  def displayInventory():Unit = {
    var inv = inventory1;
    print("display which inventory? 1 or 2: ")
    var choice = scala.io.StdIn.readLine().toInt
    if (choice == 2)
    {
      inv = inventory2
    }
    else if (choice != 1)
    {
      println("Invalid choice")
      return
    }

    if (!inv.isEmpty)
    {
      for(itm <- inv){
        println(s"${itm.PID}\t${itm.name}\t${itm.price}\t${itm.qty}")
      }
    }
    else
    {
      println(s"Inventory ${inv} is empty")
    }
  }

  def findProduct():Unit = {
    print("find product in which inventory? 1 or 2: ")
    var inv = inventory1;
    var choice = scala.io.StdIn.readLine().toInt
    
    if (choice == 2)
    {
      inv = inventory2
    }
    else if (choice != 1)
    {
      println("Invalid choice")
      return
    }

    print("Enter PID: ")
    var pid = scala.io.StdIn.readLine().toInt

    if (!inv.isEmpty)
    {
      var check = false;
      for(itm <- inv)
      {
        if (itm.PID == pid)
        {
          println(s"${itm.PID}\t${itm.name}\t${itm.price}\t${itm.qty}")
        }
      }
      if(!check){println(s"Item with PID: ${pid} not found")}
    }
    else
    {
      println(s"Inventory ${inv} is empty");
    }
  }

  def checkInventory():Unit = {
    print("check which inventory? 1 or 2: ")
    var inv = inventory1;
    var choice = scala.io.StdIn.readLine().toInt
    if (choice == 2)
    {
      inv = inventory2
    }
    else if (choice != 1)
    {
      println("Invalid choice")
      return
    }

    if (!inv.isEmpty)
    {
      println(s"Inventory ${inv} is not empty")
    }
    else
    {
      println(s"Inventory ${inv} is empty")
    }
  }

  def mergeInventory(inv1:Set[Item], inv2:Set[Item]):Unit = {
    var mergedInventory: Set[Item] = Set() //create a new set to store merged inventory

    for(itm1 <- inv1) //for each item in inv1
    {
      var check = false;
      for(itm2 <- inv2)
      {
        if (itm1.PID == itm2.PID) //if item is in both inventories, merge them
        {
          check = true;
          if (itm1.price > itm2.price)
          {
            mergedInventory += Item(itm1.PID, itm1.name, itm1.qty + itm2.qty, itm1.price)
          }
          else
          {
            mergedInventory += Item(itm1.PID, itm1.name, itm1.qty + itm2.qty, itm2.price)
          }
        }
      }
      if (!check) //add items from inv1 that are not in inv2
      {
        mergedInventory += itm1
      }
    }
    for(itm2 <- inv2) //add items from inv2 that are not in inv1
    {
      var check = false;
      for(itm1 <- inv1)
      {
        if (itm1.PID == itm2.PID)
        {
          check = true;
        }
      }
      if (!check)
      {
        mergedInventory += itm2
      }
    }
    
    //display merged inventory
    for(itm <- mergedInventory){
        println(s"${itm.PID}\t${itm.name}\t${itm.price}\t${itm.qty}")
    }
  }

  def addProduct(inv:Set[Item]):Set[Item] = {
    var pid = scala.io.StdIn.readLine().toInt
    var name = scala.io.StdIn.readLine()
    var qty = scala.io.StdIn.readLine().toInt
    var price = scala.io.StdIn.readLine().toFloat
    inv + Item(pid, name, qty, price)
  }

  def main(args: Array[String]): Unit = {
    var input = "11";
    printf("%s", "01 - add item to inventory1\n02 - add item to inventory2\n1 - show all products\n2 - find a product\n3 - check inventory\n4 - merge inventory\nPress -1 to exit\n\n");
    while (input != "-1")
    {
      print("What do you want? ")
      input = scala.io.StdIn.readLine()

      input.match
      {
        case x if x == "1" => displayInventory()
        case x if x == "2" => findProduct()
        case x if x == "3" => checkInventory()
        case x if x == "4" => mergeInventory(inv1 = inventory1, inv2 = inventory2)
        case x if x == "01" => inventory1 = addProduct(inv = inventory1)
        case x if x == "02" => inventory2 = addProduct(inv = inventory1)
        case x if x == "-1" => return;
        case _ => println("Invalid input\n")
      }
    }
  }
}