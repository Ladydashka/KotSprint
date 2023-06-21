package lesson3

fun main(){
    val str = "D2-D4;0"
    val str2 = str.split("-",";")

    val from = str2[0]
    val to = str2[1]
    val moveNumber = str2[2]

    println(from)
    println(to)
    println(moveNumber)
}


