import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    repeat (1000) {
        Thread.sleep(1000)
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("HH:mm:ss")
        val formatted = current.format(formatter)
        val ping = "$formatted - Hola"
        println(ping)


    }
}