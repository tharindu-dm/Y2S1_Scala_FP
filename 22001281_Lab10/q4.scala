/* 4. A Bank is defined as a List of Accounts. So, implement the following functions:
4.1 List of Accounts with negative balances
4.2 Calculate the sum of all account balances
4.3 Calculate the final balances of all accounts after applying the interest function as
follows:
If balance is positive, deposit interest is .05 and if balance is negative, overdraft
interest is .1
 */

object q4 {
  def main(args: Array[String]): Unit = {
    val acc1 = new Account(51364)
    val acc2 = new Account(-20)
    val acc3 = new Account(32154)
    val acc4 = new Account(-476)
    val acc5 = new Account(2652)
    val acc6 = new Account(-600)
    val acc7 = new Account(7428)
    val acc8 = new Account(-774)
    val acc9 = new Account(87534)
    val acc10 = new Account(-310)

    val bank = List(acc1, acc2, acc3, acc4, acc5, acc6, acc7, acc8, acc9, acc10)

    println("List of Accounts with negative balances")
    bank.filter(_.balance < 0).foreach(println)

    println("\nCalculate the sum of all account balances")
    println(bank.map(_.balance).sum)

    println("\nCalculate the final balances of all accounts after applying the interest function")
    bank.foreach { acc =>
      if (acc.balance > 0) {
        acc.balance += (acc.balance * 0.05).toInt
      } else {
        acc.balance += (acc.balance * 0.1).toInt
      }
    }
    bank.foreach(println)
  }
}

class Account(var balance: Int) {
  def deposit(amount: Int) = {
    balance += amount
  }

  def withdraw(amount: Int) = {
    if (balance - amount >= 0) {
      balance -= amount
    } else {
      println("Insufficient balance")
    }
  }

  def transfer(acc: Account, amount: Int) = {
    if (balance - amount >= 0) {
      balance -= amount
      acc.balance += amount
    } else {
      println("Insufficient balance")
    }
  }

  override def toString(): String = "Balance: " + balance
}