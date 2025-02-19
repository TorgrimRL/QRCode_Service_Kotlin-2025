import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val firstNameChar = scanner.nextLine().first()
    val lastName = scanner.nextLine()
    println("$firstNameChar. $lastName")
}