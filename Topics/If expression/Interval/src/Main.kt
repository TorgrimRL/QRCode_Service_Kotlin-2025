fun main() {
    val a = readln().toInt()

    println(
        when {
            a > -15 && a <= 12 -> "True"
            a in 15..16 -> "True"
            a >= 19 -> "True"
            else -> "False"
        }

    )
}