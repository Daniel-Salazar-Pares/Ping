import java.io.BufferedReader
import java.io.InputStreamReader
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    var pb = ProcessBuilder("notepad.exe”,”1.txt")
    val p:Process = pb.start()
    repeat (1000) {
        Thread.sleep(1000)
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("HH:mm:ss")
        val formatted = current.format(formatter)
        val ping = "$formatted - Hola"
        println(ping)
        p.outputStream.write(ping.toByteArray())
        p.outputStream.flush()

        val reader = BufferedReader(InputStreamReader(p.inputStream))
        val pong = reader.readLine()
        if (pong != null) {
            println(pong)
        }
    }
}