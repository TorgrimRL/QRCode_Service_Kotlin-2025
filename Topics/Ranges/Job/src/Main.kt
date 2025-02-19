fun main() {
    val age = readln().toInt()
    val workingForce = 18..59
    println(age in workingForce)
}