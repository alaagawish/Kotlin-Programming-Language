package eg.gov.iti.jets.library

data class Book(override var title: String) : LibraryItem {
    override var ISBN: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
        }
    override var publication: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
        }
    override var numberOfPages: Int = 0
        get() {
            return field
        }
        set(value) {
            field = value
        }

    override fun toString(): String {
        return "$title has an ISBN = $ISBN published in/from $publication has #pages = $numberOfPages"
    }


}