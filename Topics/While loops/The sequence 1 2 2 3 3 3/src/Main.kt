fun main() {
    val times = readln().toInt()
    var number = 1
    var count = number

    repeat(times) {
        if (count == number) {
            print("$number ")
            number++
            count = 0
        } else {
            print("$number ")
        }
        count++
    }
}