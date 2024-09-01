/*
 *  Create a method sub to subtract two rational numbers and find an answer x y-z where
x=3/4, y=5/8, z=2/7.

 */

object q2 {
  def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4);
    val y = new Rational(5, 8);
    val z = new Rational(2, 7);

    val ans = y.sub(z)

    println("x-y-z = " + x.sub(ans).toString)

  }
}

class Rational(n: Int, d: Int) {
  override def toString(): String = n + "/" + d

  def neumarator = n
  def denominator = d
  def sub(subber: Rational) ={
    new Rational(this.neumarator * subber.denominator - this.denominator * subber.neumarator, this.denominator * subber.denominator)
  }

}