fun main() {
    val backToTheWall = readln().split(", ").map { it }.toMutableList()
    val returnedWatchman = readln()
    // do not touch the lines above
    // write your code here
    backToTheWall.add(returnedWatchman)
    println(backToTheWall.joinToString())

}