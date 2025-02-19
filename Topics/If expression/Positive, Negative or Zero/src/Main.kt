fun main() {
    val number: Int = readln().toInt()

    when {
        number < 0 -> println("negative")
        number > 0 -> println("positive")
        else -> println("zero")
    }



}