/**
  *  Write a Scala program which defines a method named "toUpper" and it accepts a String
 as input parameter that is then formatted to upper case as output. Define another method
 named "toLower' which accepts a String as input parameter and formats the input to lower
 case as output.
 Define another method named "formatNames" which also has an input String called
 "name". This method however has a parameter group which accepts a function with an
 input of type String and also outputs a String.
 This particular function will be used to apply the given format to the "name" input. You can
 use the test inputs for, say, "Benny", "Niroshan", "Saman" “Kumara”, and make sure that the
 output is as shown below. (Hint: Use Lambda functions)

 Output:
 BENNY
 NIroshan
 saman
 Kumar
  */

object q3 {
  def main(args: Array[String]): Unit = {

    val toUpper = (name: String) => name.toUpperCase
    val toLower = (name: String) => name.toLowerCase

    def formatNames(name: String, f: String => String): String = {
      f(name)
    }

    println(formatNames("Benny", toUpper))
    print(formatNames("ni", toUpper))
    println(formatNames("ROSHAN", toLower))
    println(formatNames("Saman", toLower))
    print(formatNames("K", toUpper))
    println(formatNames("UMARA", toLower))
  }
}