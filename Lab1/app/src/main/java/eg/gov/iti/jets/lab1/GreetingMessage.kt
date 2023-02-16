package eg.gov.iti.jets.lab1

fun main() {
    print("enter your name: ")
    var name: String? = readLine()
    if (name?.isBlank() == true)
        println("Hello anomnous")
    else
        println(name)
}