fun main() {
    // write your code here
    val year = readln().toInt()

    println(if (isLeap(year)) "Leap" else "Regular")
}

fun isLeap(year: Int): Boolean {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0
}

