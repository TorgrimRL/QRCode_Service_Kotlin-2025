fun main() {
    val n = readln().toInt()
    val sum = (1..n).sumOf { readln().toInt() }
    println(sum)
}