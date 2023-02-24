package eg.gov.iti.jets.classes

interface Number {
    var start: Int
    var current: Int
    fun getNext(): Int
    fun reset()
}