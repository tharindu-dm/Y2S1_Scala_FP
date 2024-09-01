/**
. Implement a Data Structure for Account and create a method transfer which transfers
the money from this account to a given account.
Basic functions: Deposit, Withdraw, Transfer
  */

object q3 {
  def main(args: Array[String]): Unit = {
    val acc1 = new Account(1000)
    val acc2 = new Account(2000)

    acc1.transfer(acc2, 500)
    println("transfer 500 from acc1 and to acc2")
    println("acc1: " + acc1.toString())
    println("acc2: " + acc2.toString())

    println("\ndeposit 1000 to acc2")
    acc2.deposit(1000)
    println("acc2: " + acc2.toString())

    println("\ntransfer 3000 from acc2 and to acc1")
    acc2.transfer(acc1, 3000)
    println("acc1: " + acc1.toString())
    println("acc2: " + acc2.toString())

    println("\nwithdraw 500 from acc1")
    acc1.withdraw(500)
    println("acc1: " + acc1.toString())
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