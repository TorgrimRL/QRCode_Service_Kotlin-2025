fun summator(map: Map<Int, Int>): Int {
    var sum = 0
    for (pairs in map)
        if (pairs.key % 2 == 0) {
            sum += pairs.value
        }

    return sum
}