package lesson2

fun main(){
    val hour = 9 * 60
    val min = 39

    val totalTimeInMin = 457+ hour + min
    val hourOfArrival = totalTimeInMin / 60
    val minOfArrival = totalTimeInMin % hourOfArrival
    println("${hourOfArrival}:${minOfArrival}")

}

