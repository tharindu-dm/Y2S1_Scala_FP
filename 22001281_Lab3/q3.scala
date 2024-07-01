def floater(n1:Int, n2:Int) = {
    var avg:Float = (n1 + n2).toFloat / 2
    printf("%.2f\n", avg)
}

object q3 {
    def main(args: Array[String]):Unit = {
        val num1:Int = 96
        val num2:Int = 43

        floater(num1, num2)
    }
}

