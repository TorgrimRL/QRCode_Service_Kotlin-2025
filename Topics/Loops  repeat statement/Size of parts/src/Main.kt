fun main() {
    val parts: Int = readln().toInt()
    val inputs = List(parts) { readln().toInt() }
    val larger = inputs.count { it == 1 }
    val smaller = inputs.count { it == -1}
    val perfect = inputs.count { it == 0 }
    println("$perfect $larger $smaller")
}