def CoverPrice(book:Int, price:Float) = book * price //total book price
def Discount(book:Int, price:Float, discount:Float) = CoverPrice(book, price) * discount / 100; //disount received

def total(book:Int, price:Float, discount:Float):Double = CoverPrice(book, price) - Discount(book, price, discount)
//final price after deducting the discount

def shipping(book:Int):Double = if(book > 50) 50*3f + 0.75*(book-50) else book * 3f
//shipping cost

def WholePrice(book:Int, price:Float, discount:Float) = shipping(book) + total(book, price, discount)
//final pricing