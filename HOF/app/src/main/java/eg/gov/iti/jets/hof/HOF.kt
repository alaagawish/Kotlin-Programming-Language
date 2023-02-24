package eg.gov.iti.jets.hof

typealias IntType = (Int, Int) -> Int

var add = { num1: Int, num2: Int -> num1 + num2 }
var sub = { num1: Int, num2: Int -> num1 - num2 }
var mult = { num1: Int, num2: Int -> num1 * num2 }
var div = { num1: Int, num2: Int -> if (num2 == 0) 0 else num1 / num2 }
fun calculator(num1: Int, num2: Int, intType: IntType) = intType(num1, num2)
fun main() {

    println("2 + 3 = ${calculator(2, 3, add)}")
    println("2 - 3 = ${calculator(2, 3, sub)}")
    println("2 * 3 = ${calculator(2, 3, mult)}")
    println("6 / 3 = ${calculator(6, 3, div)}")
    println("2 / 0 = ${calculator(2, 0, div)}")
}

