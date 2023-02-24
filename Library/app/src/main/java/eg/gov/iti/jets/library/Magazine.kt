package eg.gov.iti.jets.library

data class Magazine(
    override var title: String,
    override var ISBN: String,
    override var publication: String,
    override var numberOfPages: Int
) : LibraryItem {


}