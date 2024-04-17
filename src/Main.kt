import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Thread.sleep
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Scanner

fun main() {
        var pb = ProcessBuilder("java", "-jar", "C:\\Users\\user\\IdeaProjects\\pong\\out\\artifacts\\pong_jar\\pong.jar")
        val p: Process = pb.start()


        //definim el format de l0hora i la guardem a una variable
        val formatter = DateTimeFormatter.ofPattern("HH:mm:ss")

        val current = LocalDateTime.now()
        val formatted = current.format(formatter)
        val ping = "$formatted - Hola\n"
        print(ping)

        //llegim la resposta del pong
        p.outputStream.write(ping.toByteArray())
        val reader = BufferedReader(InputStreamReader(p.inputStream))
        var pong = reader.readLine()
        println(pong)


}