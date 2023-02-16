package eg.gov.iti.jets.lab1

fun main() {
    print("enter first number ")
    var number1: Int = readLine()?.toInt() ?: 0
    print("enter second number ")
    var number2: Int = readLine()?.toInt() ?: 0
    print("enter operation + - * / ")
    var operation: Char = readLine()?.single() ?: ' '
    when (operation) {
        '*' -> print("$number1 * $number2 = " + number1 * number2)
        '+' -> print("$number1 + $number2 = " + number1 + number2)
        '-' -> print("$number1 - $number2 = " + Math.subtractExact(number1,number2))
        '/' -> {
            if (number2 > 0)
                print("$number1 / $number2 = " + number1 / number2)
            else
                println("Cant divide by zero")
        }
    }


}