package lesson2

fun main(){
    val hour = 9
    val timeInMin = 9 * 60
    val travelTime = 457
    val min = 39

    val totalTimeInMin = travelTime + timeInMin + min
    val hourOfArrival = totalTimeInMin / 60
    val minOfArrival = totalTimeInMin % hourOfArrival
    println("$hourOfArrival:$minOfArrival")

}

