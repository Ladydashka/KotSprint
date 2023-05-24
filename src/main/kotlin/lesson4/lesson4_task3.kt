package lesson4

fun main(){
    val weatherToday = "солнечная погода"
    val lightingToday = "тент раскрыт"
    val humidityToday = "влажность 20"
    val seasonToday = "зима"
    println("Благоприятные ли условия сейчас для роста бобовых?${(WEATHER == weatherToday) && 
            (LIGHTING == lightingToday) &&
            (HUMIDITY == humidityToday) &&
            (SEASON == seasonToday)}")
}
const val WEATHER = "солнечная погода"
const val LIGHTING = "тент раскрыт"
const val HUMIDITY = "влажность 20"
const val SEASON = "не зима"