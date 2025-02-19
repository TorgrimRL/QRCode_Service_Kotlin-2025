fun main() {
    val size = readln().toInt()
    val mutList: MutableList<Int> = mutableListOf()
    for (i in 0 until size) {
        mutList.add(readln().toInt())
    }
    val rotate = readln().toInt()
    val effectiveRotation = (rotate % size) % size
    for (i in mutList.indices) {
        val newIndex = (i - effectiveRotation + size) % size
        print(mutList[newIndex])
        print(" ")
    }
}