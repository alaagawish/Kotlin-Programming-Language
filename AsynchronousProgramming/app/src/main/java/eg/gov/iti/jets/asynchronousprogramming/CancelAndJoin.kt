package eg.gov.iti.jets.asynchronousprogramming

import kotlinx.coroutines.*

fun main() {
    runBlocking {
        var a = launch {
            withContext(NonCancellable) {
                repeat(10) {
                    println(it)
//                    delay(100)
                }
            }
            repeat(10) {
                println("out NonCancellable $it")
                delay(10)

            }

        }

//a.join()
//        delay(1)
        a.cancelAndJoin()
        var b = launch {
            withContext(NonCancellable) {
                repeat(10) {
                    println(it + 100)
                    delay(100)

                }
            }

        }
    }
}