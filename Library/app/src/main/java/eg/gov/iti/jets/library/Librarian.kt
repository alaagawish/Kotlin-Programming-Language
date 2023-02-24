package eg.gov.iti.jets.library

data class Librarian(override var name: String, override var id: Int, var password: String) :
    Person {

}