def convert() = {
    var a = 2
    var b = 3
    var c = 4
    var d = 5
    var k = 4.3f

    //a
    b -= 1
    println("(a) --b * a + c *d-- \t\t= " + (b * a + c * d))
    d -= 1

    //b
    println("(b) a++ \t\t\t= " + (a))
    a +=1 

    //c
    //(c) -2 * ( g - k ) +c : 'g' is not defined in the question, therefore assume it as 5
    println("(c) -2 * ( g - k ) +c \t\t= " + (-2 * ( 5 - k ) + c))

    //d
    println("(d) c=c++ \t\t\t= " + (c))
    c += 1

    //e
    c += 1
    println("(e) c=++c*a++ \t\t\t= " + (c * a))
    a += 1
}

object q2 {
    def main(args: Array[String]):Unit = {
        convert()
    }
}