package eg.gov.iti.jets.asynchronousprogramming

import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

suspend fun arraySummation(array: IntArray) = array.sum()

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5)
    runBlocking {
        val result = async {
            arraySummation(array)
        }
        println("array elements summation = ${result.await()}")
    }
}


