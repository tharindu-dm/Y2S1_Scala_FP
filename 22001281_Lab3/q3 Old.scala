def floater(n1:Int, n2:Int):Float = {
    var avg:Float = 511.97604 //(n1 + n2).toFloat / 2   //511.97604
    var interger = avg.floor.toInt        //511
    var floatDiff = avg - interger   //0.97604

    var finalFloat = (floatDiff * 100).floor.toInt //97
    var value = (floatDiff * 1000).floor.toInt - ((finalFloat) * 10) //(976)-970 = 6
    
    if(value >= 5)
    {
        finalFloat += 1; //97 -> 98
    }
    
    var result = finalFloat.toFloat/(100f)
    return interger.toFloat + result
}

object q3 {
    def main(args: Array[String]):Unit = {
        val num1:Int = 96
        val num2:Int = 43

        println(floater(num1, num2))
    }
}

