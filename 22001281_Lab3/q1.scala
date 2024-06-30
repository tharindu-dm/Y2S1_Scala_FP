def reverse(words:String):Unit = {
    var  len = words.size
    if(len == 1)
    {
        print(words.charAt(0))
        return
    }
    else
    {
        reverse(words.substring(1, len)) //to get (len-1)th character according to arrays, (len) should be set as the last index
    }
    print(words.charAt(0))

}

object q1 {
    def main(args: Array[String]):Unit = {
        println("Reversing String: !tseb eht si avaJ")
        reverse("!tseb eht si avaJ")
    }
}