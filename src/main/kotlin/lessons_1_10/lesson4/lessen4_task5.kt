package lessons_1_10.lesson4

fun main() {
   val isHullbroken: Boolean = readLine().toBoolean()
   val crewNumber: Int = readLine()?.toInt() ?: 0
   val numberOfBoxesOfProvisions = readLine()?.toInt() ?: 0
   val isGoodWeatherConditions = readLine().toBoolean()

    val isShipWillSail =
       (isHullbroken == HULL_BROKEN &&
               (crewNumber in 55..69) &&
               (numberOfBoxesOfProvisions > 50) &&
               (isGoodWeatherConditions == GOOD_WEATHER || isGoodWeatherConditions != GOOD_WEATHER)) ||

               ((isHullbroken != HULL_BROKEN) && (crewNumber == 70) && (numberOfBoxesOfProvisions > 50) &&
                       (isGoodWeatherConditions == GOOD_WEATHER))

    println("Корабль отправится в путешествие $isShipWillSail")
}
const val HULL_BROKEN = false
const val GOOD_WEATHER = true


