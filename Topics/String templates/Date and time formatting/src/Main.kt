fun main() {
    // write your code here
    val (hours, min, sec) = readln().split(' ')
    val (day, month, year) = readln().split(' ')

    println("$hours:$min:$sec $day/$month/$year")
}