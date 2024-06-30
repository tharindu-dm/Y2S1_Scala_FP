def sumOfEvenNumbers(list: List[Int]): Int = {
    list.filter(_ % 2 == 0).sum // filter even numbers and sum them
}

def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(sumOfEvenNumbers(list))
}


