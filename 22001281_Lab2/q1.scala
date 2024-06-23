def variable() = {
    //var is used since its mutable. Val is immutable
    var i = 2
    var j = 2
    var m = 5
    var n = 5
    var k = 2
    var f = 12.0f
    var g = 4.0f
    var c = 'X'

    println("(a) k + 12 * m \t\t= " + (k + 12 * m))
    println("(c) n % j \t\t= " + (n % j))
    println("(b) m / j \t\t= " + (m / j))
    println("(d) m / j * j \t\t= " + (m / j * j))
    println("(e) f + 10 * 5 + g \t= " + (f + 10 * 5 + g))

    i += 1
    print("(f) ++i * n \t\t= " + (i * n))

}

object q1 {
    def main(args: Array[String]):Unit = {
        variable()
    }
}