/**
  *  Develop the function of interest. It consumes a deposit amount and produces the actual
 amount of interest that the money earns in a year. 
 
 The bank pays a flat 2% for deposits of
 up to Rs. 20 000, a flat 4% per year for deposits of up to Rs. 200 000, a flat 3.5% per year
 for deposits of up to Rs. 2 000 000, and a flat 6.5% for deposits of more than Rs. 200 000.
 (Hint: Use Lambda functions)
  */

object q1 {
  def main(args: Array[String]): Unit = {
    val deposit = args(0).toFloat

    val interest = (dep:Float) => {
      if (dep <= 20000) 0.02f * dep
      else if (dep <= 200000) 0.04f * dep
      else if (dep <= 2000000) 0.035f * dep
      else 0.065f * dep
    }
    println("Interest: LKR. " + interest(deposit));
  }
}