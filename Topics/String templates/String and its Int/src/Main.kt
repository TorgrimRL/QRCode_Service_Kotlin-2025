import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    while (scanner.hasNext()) {
        val value = scanner.next()
        val intRepresentation = value.toInt()
        val halfValueInInt = intRepresentation / 2
        println("The obtained value is $value and its Int representation after division by 2 is $halfValueInInt")
    }

}