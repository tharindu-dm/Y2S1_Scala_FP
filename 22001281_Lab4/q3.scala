object StringFormatter {
  def toUpper(input: String): String = {
    input.toUpperCase
  }

  def toLower(input: String): String = {
    input.toLowerCase
  }

  def formatNames(name: String)(f: String => String): String = {
    f(name) // f is a function that takes a string and returns a string
  }

  def main(args: Array[String]): Unit = {
    println(formatNames("Benny")(toUpper))
    println(formatNames("Niroshan")(toLower))
    println(formatNames("Saman")(toUpper))
    println(formatNames("Kumara")(toLower))
  }
}