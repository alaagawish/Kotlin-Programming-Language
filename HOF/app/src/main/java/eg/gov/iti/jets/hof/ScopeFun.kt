package eg.gov.iti.jets.hof

data class Person(var id: Int, var name: String, var gender: String)


fun main() {
    var person = Person(1, "Ahmed", "male")
    println(person)

    person.apply {
        name = "karim"
        gender = "Male"
    }
//    println(person)
    person.let {
        person.id++
        println("let: $it")

    }
    println(person)

    person.run {
        name = "alaa"
        gender = "female"
        println("run: $this")

    }
    person.also {
        println("also: $it")
    }
    with(person) {
        id = 7
        println("with: $this")

    }
}