fun main() {
    val input = readln()
    if (input.isNotEmpty()) {
        val firstSymbol = input.first()
        println(
            when (firstSymbol) {
                'i' -> input.drop(1).toInt() + 1
                's' -> input.drop(1).reversed()
                else -> input
            }
        )
    }
}