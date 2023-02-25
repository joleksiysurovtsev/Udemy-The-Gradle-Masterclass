import java.text.SimpleDateFormat
import java.util.*

/*
defaultTasks("hello")

tasks.register("hello") {
    doLast {
        println("Hello world")
    }
}
*/
val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mmss'Z'")

simpleDateFormat.timeZone = TimeZone.getTimeZone("UTC")

println("Hello world " + simpleDateFormat.format(Date()))

fun sayHello() {
    println("Hello from method")
}

sayHello()