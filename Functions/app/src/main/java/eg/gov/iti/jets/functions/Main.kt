package eg.gov.iti.jets.functions

fun main() {
    var number1 = Complex(2, 3)
    var number2 = Complex()
    var number3 = Complex(imag = -1, real = 1)

    var sumResult: Complex = number1 + number3
    println("number1 + number3 = ${sumResult}")
    println("number2 = ${number2}")
    sumResult.println()

    (number2 - number1).println()
    println("number1 - number3 = ${number1 - number3}")
    println("number1 + number3 + ${number1 + number3}")


}