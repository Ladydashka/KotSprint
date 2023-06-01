package lesson8

fun main() {
    val array = arrayOf(5, 12, 34, 42, 56, 15, 21)
    var sum = 0
    for (i in array){
        sum += i
    }
    println(sum)
}