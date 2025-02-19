fun main() {
    val input = readln().split(" ")
    val firstNameChar = input[0].first()
    val lastname = input[1]
    val age = input[2]
    println("$firstNameChar. $lastname, $age years old")
}