import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.runBlocking
import kotlin.coroutines.experimental.CoroutineContext


fun main(args: Array<String>) {
    async(CommonPool) {
        println("coroutine running")
        runBlocking { delay(1000) }
        println("coroutine completed")
    }
    println("main running")
    runBlocking { delay(1500) }
}