package eg.gov.iti.jets.library

data class User(override var name: String, override var id: Int, var job: String) : Person {
}