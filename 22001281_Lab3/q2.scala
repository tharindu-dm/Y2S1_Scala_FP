def StringLister(wList:List[String]):Unit = {
    wList.foreach(f => if (f.size > 5) println(f))
}

object q2 {
    def main(args: Array[String]):Unit = {
        
        var wordList: List[String] = List("Bud", "Military", "My", "Luckiest", "And", "Complexities")
        StringLister(wordList)
    }
}