def normalPay(normal:Int):Double = {
    normal * 250
}

def otPay(ot:Int):Double = {
    ot * 85
}

def GrossPay(normal:Int, ot:Int):Double = {
    normalPay(normal) + otPay(ot)
}

def tax(normal:Int, ot:Int):Double = {
    GrossPay(normal, ot) * 0.12
}

def takeHome(normal:Int, ot:Int):Double = {
    GrossPay(normal, ot) - tax(normal, ot)
}

object q3 {
    def main(args: Array[String]):Unit = {
        println("Take home salary = Rs. " + takeHome(40, 30))
    }
}

