def CoverPrice(book:Int) = book * 24.95f //total book price

def Discount(book:Int, discount:Float) = CoverPrice(book) * discount / 100; //disount received

def total(book:Int, discount:Float):Double = CoverPrice(book) - Discount(book, discount)
//final price after deducting the discount

def shipping(book:Int):Double = if(book > 50) 3f + 0.75*(book-50) else 3f
//Shipping costs Rs. 3 for the first 50 copies and 75 cents for each additional copy.

def WholePrice(book:Int, discount:Float) = shipping(book) + total(book, discount)
//final pricing