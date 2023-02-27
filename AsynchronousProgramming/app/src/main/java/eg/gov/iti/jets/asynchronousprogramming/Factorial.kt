package eg.gov.iti.jets.asynchronousprogramming

import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

suspend fun factorial(num: Long): Long {
    if (num <= 1)
        return 1
    else
        return num * factorial(num - 1)

}

fun main() {
//println(factorial(4))
    runBlocking {
        var factorial = async {
            factorial(5)
//            factorial(1000)
        }
        println(factorial.await())
    }
}
