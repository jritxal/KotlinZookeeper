fun main() {
    // put your code here
    var number = readln().toInt()

    if (++number % 2 == 0) {
        println(number)
    }else{
        println(++number)
    }
}