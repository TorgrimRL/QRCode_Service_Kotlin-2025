fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()
    val e = readln().toInt()

    val rangeOne = a..b
    val rangeTwo = c..d
    println(e in rangeOne union rangeTwo)
}