package eg.gov.iti.jets.library

interface LibraryItem {
    var title: String
    var ISBN: String
    var publication: String
    var numberOfPages: Int
    fun isAvailable(): Boolean {
        return true
    }


}