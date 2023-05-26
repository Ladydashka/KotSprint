package lesson5

fun main(){
    val yearOfBirth = readLine()!!.toInt()
    val age = 2023 - yearOfBirth
    if (age >= AGE_OF_MAJORITY) println( "Показать экран со скрытым контентом")
    else println("Вернуться на главный экран")
}
const val AGE_OF_MAJORITY = 18

