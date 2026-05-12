import java.io.File

fun main() {
    val words = File("resources/eventyr.txt").readLines();

    fun signature(word: String): String =
        word.toCharArray().sorted().joinToString("")

    val grouped = words.groupBy { signature(it) }

    grouped.values
        .forEach {
            println(it.joinToString(" "))
        }
    }