fun main() {    
    val a = readln().toInt()
    val b = readln().toInt()
    val h = readln().toInt()

    when  {
        h < a -> println("Deficiency")
        h > b -> println("Excess")
        else -> println("Normal")
    }
}