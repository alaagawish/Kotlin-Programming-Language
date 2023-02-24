package eg.gov.iti.jets.classes

fun main() {
    var person = Person("Alaa",  Person.Address("A", "a",  Person.Building.VILLA))

    println(person)

    var byThrees = ByThrees()
    repeat(10) {
        println(byThrees.getNext())
    }
    byThrees.reset()
    println("RESET DONE")
    println(byThrees.getNext())
}