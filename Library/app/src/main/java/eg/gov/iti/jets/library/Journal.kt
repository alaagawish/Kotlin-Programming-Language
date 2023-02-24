package eg.gov.iti.jets.library

class Journal() : LibraryItem {
    override var title: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
        }
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
        return "[Journal: $title, $ISBN, $numberOfPages ,$publication]"
    }
}