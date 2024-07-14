object q2 {
  case class Book(title: String, author: String, isbn: String)
  var library: Set[Book] = Set(
    Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"),
    Book("To Kill a Mockingbird", "Harper Lee", "9780061120084"),
    Book("1984", "George Orwell", "9780451524935")
  )

  def addBook(title: String, author: String, isbn: String): Unit = {
    library += Book(title, author, isbn)
  }

  def removeBook(isbn: String): Unit = {
    library = library.filterNot(_.isbn == isbn)
  }

  def checkBook(isbn: String): Boolean = {
    library.exists(_.isbn == isbn)
  }

  def displayLibrary(): Unit = {
    for (book <- library) {
      println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
    }
  }

  def searchBook(title: String): Unit = {
    val book = library.find(_.title == title)
    book match {
      case Some(b) => println(s"Title: ${b.title}, Author: ${b.author}, ISBN: ${b.isbn}")
      case None => println("Book not found")
    }
  }

  def displayBooksByAuthor(author: String): Unit = {
    val books = library.filter(_.author == author)
    if (books.isEmpty) {
      println("No books found by this author")
    } else {
      for (book <- books) {
        println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      }
    }
  }

  def main(args: Array[String]): Unit = {
    displayLibrary()
    addBook("Pride and Prejudice", "Jane Austen", "9780141439518")
    println("Book added")
    displayLibrary()
    removeBook("9780061120084")
    println("Book removed")
    displayLibrary()
    println(s"Book with ISBN 9780451524935 is in library: ${checkBook("9780451524935")}")
    println(s"Book with ISBN 9780061120084 is in library: ${checkBook("9780061120084")}")
    searchBook("1984")
    searchBook("The Great Gatsby")
    displayBooksByAuthor("George Orwell")
    displayBooksByAuthor("Jane Austen")
  }
}