package eg.gov.iti.jets.lab1

import kotlin.random.Random


fun main() {
    var numbers= arrayOfNulls<Int>(100)
    var number:Int
    var i=0
    repeat(100) {

        number= Random.nextInt(0, 100)
        numbers.set(i,number)
        if(number<=10)
            println(number)
        i++
    }
}