/*
* Implement a Data Structure for Rational Number and create a method neg to
* class Rational that is used like this: x.neg 
* evaluates to -x
*/

object q1 {
  def main(args: Array[String]): Unit = {
    val str = args(0).split('/')

    val neu = str(0).toInt
    val den = str(1).toInt
    if (den != 0) {
      val r = new Rational(neu, den)
      println("negation is: " + r.neg.toString())
    } else { println("denominator is 0\n") }

  }
}

class Rational(n: Int, d: Int) {
  def neg = new Rational(-n, d)

  override def toString(): String = n + "/" + d
}
