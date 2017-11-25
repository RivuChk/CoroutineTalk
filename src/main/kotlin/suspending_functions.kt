import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking
import kotlin.system.measureTimeMillis

suspend fun longRunningTask():String {
    println("Starting a Long Running Task")
    delay(1000)
    println("Using delay to simulate Long Running task")
    delay(1500)
    println("completed long running task")
    return "returning a string"
}

suspend fun longRunningTaskMeasure() = measureTimeMillis {
    println("We can also measure time a task took to complete")
    delay(500)
    println("should show something near 500")
}

fun main(args: Array<String>) {
    launch {
        val str = longRunningTask()
        println(str)
        println(longRunningTaskMeasure())
    }
    println("main thread running as usual")
    runBlocking { delay(3500) }
}