fun main() {
    val a = arrayOf(1,5,7,10,44)
    print(binarySearch(a, -1))
}

fun binarySearch(a: Array<Int>, i: Int): Int {
    var t1 = 0
    var t2 = a.size - 1
    var t = (t2 - t1)/2
    while (a[t] != i && t != t1 && t != t2) {
        if (a[t] < i)
            t1 = t
        else
            t2 = t
        if (a[t2] == i)
            t = t2
        else if (a[t1] == i)
            t = t1
        else
            t = (t2 + t1)/2
    }
    if (a[t] == i)
        return t
    else
        return -1
}