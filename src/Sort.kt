fun main() {
    val a = listOf(1,5,2,6,10,4)
    print(insert(a))
}

fun insert(a: List<Int>): List<Int> {
    val b = a.toMutableList()
    val res = mutableListOf<Int>()
    while (b.size > 0) {
        val maxI = getMax(b)
        res.add(b[maxI])
        b.removeAt(maxI)
    }
    return res
}

fun getMax(a: List<Int>): Int {
    var maxIdx = 0
    for (i in 1..a.size - 1) {
        if (a[i] > a[maxIdx])
            maxIdx = i
    }
    return maxIdx
}