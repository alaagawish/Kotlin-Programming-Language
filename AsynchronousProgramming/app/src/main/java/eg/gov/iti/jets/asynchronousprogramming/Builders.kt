package eg.gov.iti.jets.asynchronousprogramming

import kotlinx.coroutines.*

suspend fun main() {

    val launchCounter = CoroutineScope(Dispatchers.Default).launch {
        for (i in 1..10) {
            println("Counter in launch = $i")
            delay(100)
        }
    }
    launchCounter.join()
    val asyncCounter = runBlocking {
        var j = async {
            for (i in 1..10) {
                println("Counter in async = $i")
                delay(100)
            }
        }
        j.join()
        println("Async finished ")
    }

    val mainCounter = runBlocking {
        var a = launch {
            for (i in 1..10) {
                println("Counter in main Launch = $i")
                delay(100)
            }

        }
//        a.join()
        var j = async {
            for (i in 1..10) {
                println("Counter in main Async = $i")
                delay(80)
            }
        }
//        j.join()
        println("main Async finished ")
    }
}