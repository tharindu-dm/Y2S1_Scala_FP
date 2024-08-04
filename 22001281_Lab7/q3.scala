object q3 {
    def main(args: Array[String]): Unit = {
        val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val primeList = filterPrime(list)
        println(primeList)
    }
    
    def filterPrime(list: List[Int]): List[Int] = {
        list.filter(x => isPrime(x))
    }
    
    def isPrime(n: Int): Boolean = {
        if (n <= 1) {
        return false
        }
        for (i <- 2 to n / 2) {
        if (n % i == 0) {
            return false
        }
        }
        return true
    }
}
