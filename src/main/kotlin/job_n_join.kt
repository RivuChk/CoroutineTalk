import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

fun main(args: Array<String>) = runBlocking {
    val job = launch {
        val str = longRunningTask()
        println(str)
        println(longRunningTaskMeasure())
    }
    println("main thread running as usual")
    job.join()
}