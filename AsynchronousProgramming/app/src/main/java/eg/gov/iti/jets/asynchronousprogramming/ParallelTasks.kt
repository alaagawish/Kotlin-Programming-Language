package eg.gov.iti.jets.asynchronousprogramming

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    runBlocking {
        val task1 = launch {
            repeat(150) {
                if (it % 2 == 0) println("repeat number Task1:$it")
                delay(150)
            }
        }

        val task2 = launch {
            repeat(150) {
                if (it % 2 != 0) println("repeat number Task2:${150 - it}")
                delay(100)
            }
        }
        delay(10000)
        task1.cancel()
        task2.cancel()
        println("cancel")

    }
}