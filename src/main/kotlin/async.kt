import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.runBlocking
import java.util.*

suspend fun getRandomNumber():Int {
    delay(1000)
    return Random().nextInt(100)
}

fun main(args: Array<String>) {
    val x = async {getRandomNumber()}
    runBlocking { print("Random Number ${x.await()}") }
}