fun main() {
    val (a, b, c) = List(3) { readln().toInt() }
    val desksClass1 = (a + 1) / 2
    val desksClass2 = (b + 1) / 2
    val desksClass3 = (c + 1) / 2

    val totalDesksNeeded = desksClass1 + desksClass2 + desksClass3

    println(totalDesksNeeded)
}