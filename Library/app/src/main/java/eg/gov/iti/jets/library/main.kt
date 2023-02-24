package eg.gov.iti.jets.library

fun main() {
    var libraryDatabase = LibraryDatabase()

    var days = Book("Days")
    days.ISBN = "342-i98-ah7"
    days.numberOfPages = 200
    days.publication = "Dar al nashr"
    var librarian = Librarian("Mohamed", 22, "1234")
    libraryDatabase.addBook(days)
    var magazine = Magazine("hello", "102-md83-jh3", "19/2/2007", 20)
    libraryDatabase.addBook(magazine)

    println("search for a book kkk >>> ${libraryDatabase.searchForABook("kkk")}")
    var book = libraryDatabase.searchForABook("Days")
    var user = User("Alaa", 1, "Student")
    println(libraryDatabase.availableBooks)

    if (book != null) {
        println("search for a book days >>> ${libraryDatabase.searchForABook("Days")}")
        libraryDatabase.lendBook(book, user)
    } else
        println("this book is not available")
    println("search for a book days >>> ${libraryDatabase.searchForABook("Days")}")
    var book1 = Book("book1")
    days.ISBN = "342-i98-ah7"
    days.numberOfPages = 300
    days.publication = "publication"

    var magazine1 = Magazine("magazine", "192-37-jjd7", "MagaPublication", 250)
    var journal1 = Journal()
    journal1.numberOfPages = 320
    journal1.ISBN = "kjj-9n9-00j1"
    journal1.title = "journal1"
    var borrowedBooks = listOf<LibraryItem>(book1, days, magazine1, journal1)
    libraryDatabase.addBook(magazine1)
    libraryDatabase.addBook(journal1)
    libraryDatabase.addBook(book1)
    println("available books: ${libraryDatabase.availableBooks}")

    libraryDatabase.recieveBookFromBorrower(borrowedBooks)
    println("available books: ${libraryDatabase.viewAvailableBooks()}")

}