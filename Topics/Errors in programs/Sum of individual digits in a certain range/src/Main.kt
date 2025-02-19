import java.util.*

//Start of Kotlin Program
fun main(args: Array<String>) {

    //Create a scan instance for reading line from standard Input
    val scan = Scanner(System.`in`)

    // Reading an integer as input
    var userInput = scan.nextLine().trim()
    val number = userInput.toIntOrNull()
    if (number == null || number !in 1..9999) {
        println("Invalid Input")
        return
    }
    var sum = 0
    for (numb in userInput) {
        sum += numb.digitToInt()
    }
    println(sum)
    //If the user input is an integer
    //If the user input is between 1 and 9999 (inclusive) 
    //If not, print 'Invalid Input'.
    //Otherwise, calculate the sum of the individual digits of this integer.
}
// End of Kotlin Program