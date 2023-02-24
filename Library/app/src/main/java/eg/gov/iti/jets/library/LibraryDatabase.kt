package eg.gov.iti.jets.library

class LibraryDatabase() {

    var borrowedBooks = mutableMapOf<LibraryItem, User>()
    var currentLibrarian: String? = null
    var availableBooks = mutableListOf<LibraryItem>()

    fun addBook(libraryItem: LibraryItem): Unit {
        availableBooks.add(libraryItem)
        println("available books from add book ${availableBooks.last().title} ,,,, siza=${availableBooks.size}")
        println("${libraryItem.title} added")

    }

    fun lendBook(libraryItem: LibraryItem, user: User) {
        borrowedBooks.put(libraryItem, user)
        availableBooks.remove(libraryItem)
    }

    fun viewAvailableBooks(): MutableList<LibraryItem> {
        return availableBooks
    }

    fun searchForABook(bookTile: String): LibraryItem? {
        for (book in availableBooks) {
            if (book.title == bookTile) {
                println("book is available")
                return book
            }

        }
        return null
    }

    fun recieveBookFromBorrower(books: List<LibraryItem>) {
        for (book in books) {
            var user = borrowedBooks.get(book)
            if (user != null) {
                borrowedBooks.remove(book)
                availableBooks.add(book)
            }

        }
    }
}