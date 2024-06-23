def attendance(price:Float):Float = {
    if(price > 15) 120 - (price - 15) * 20 / 5f
    else 120 + (15 - price) * 20 / 5f
}

def cost(price:Float):Float = {
    500 + 3 * attendance(price)
}

def revenue(ticketPrice:Float):Float = {
    (ticketPrice * attendance(ticketPrice)) - cost(ticketPrice)
}

object q4 {
    def main(args: Array[String]):Unit = {
        println("Profit at Rs. per 10 ticket = "+ revenue(10))
        println("Profit at Rs. per 15 ticket = "+ revenue(15))
        println("Profit at Rs. per 20 ticket = "+ revenue(20))
        println("Profit at Rs. per 25 ticket = "+ revenue(25))
        println("Profit at Rs. per 30 ticket = "+ revenue(30))
    }
}