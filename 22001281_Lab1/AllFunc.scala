//1 Disk Area
    def sq(num: Float): Float = num * num

    def area(r:Float):Double= java.lang.Math.PI * sq(r)

//2. Celcius to Fahrenheit
    def multiplier(deg:Float) = deg*1.8

    def CtoF(degC:Float) = multiplier(degC) + 32.0

//3. Sphere volume
    def ToSquare(i:Float) = i*i
    def ToCube(i:Float) = ToSquare(i) * i

    def Volume(r:Float) = 4 * ToCube(r) * java.lang.Math.PI / 3f

//4. Book shipping
    def CoverPrice(book:Int) = book * 24.95f //total book price

    def Discount(book:Int, discount:Float) = CoverPrice(book) * discount / 100; //disount received

    def total(book:Int, discount:Float):Double = CoverPrice(book) - Discount(book, discount)
    //final price after deducting the discount

    def shipping(book:Int):Double = if(book > 50) 3f + 0.75*(book-50) else 3f
    //Shipping costs Rs. 3 for the first 50 copies and 75 cents for each additional copy.

    def WholePrice(book:Int, discount:Float) = shipping(book) + total(book, discount)
    //final pricing

//5. running
    def ep(x:Int):Int = x * 8

    def tempo(x:Int):Int = x * 7