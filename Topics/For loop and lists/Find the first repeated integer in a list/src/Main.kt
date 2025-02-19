// import required
import java.util.*

fun main(args: Array<String>) {
    // Read input string
    val scanner = Scanner(System.`in`)
    val input = scanner.nextLine()

    // Convert the string to a list of integers
    val numbers = input.split(" ").map { it.toInt() }.toMutableList()

    // Initialize data structures for finding first repeated number
    var found = false
    val uniqueNumbers = mutableListOf<Int>()
    for (number in numbers){
        if (uniqueNumbers.contains(number)) {
            println(number)
            found = true
            break
        } else {
            uniqueNumbers.add(number)
        }
    }
    if (!found) {
        println(-1)
    }
}