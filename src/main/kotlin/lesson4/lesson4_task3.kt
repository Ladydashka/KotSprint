package lesson4

fun main(){
    val weatherToday = true
    val isTentOpen = true
    val humidityToday = 20
    val isWinter = true
    println("Благоприятные ли условия сейчас для роста бобовых?${(GOOD_WEATHER == weatherToday) && 
            (TENT_OPEN == isTentOpen) &&
            (HUMIDITY == humidityToday) &&
            (BEANS_SEASON == isWinter)}")
}
const val GOOD_WEATHER = true
const val TENT_OPEN = true
const val HUMIDITY = 20
const val BEANS_SEASON = false