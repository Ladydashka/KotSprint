package lesson2

import kotlin.math.pow

fun main(){
    val money = 70000
    val interest = 16.7
    val time = 20.0
    val sumIn20Year = money * (1 + interest / 100 * 1).pow(time)
    println(String.format("%.3f", sumIn20Year))
}

