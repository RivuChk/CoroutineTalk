import kotlinx.coroutines.experimental.*
import kotlin.coroutines.experimental.CoroutineContext


fun main(args: Array<String>) {
    launch(CommonPool) {
        println("coroutine running")
        runBlocking { delay(1000) }
        println("coroutine completed")
    }
    println("main running")
    runBlocking { delay(1500) }
}