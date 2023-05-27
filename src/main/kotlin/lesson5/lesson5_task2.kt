package lesson5

fun main(){
    println("Введите год рождения")
    val yearOfBirth = readLine()?.toInt() ?: 1
    val age = 2023 - yearOfBirth
    if (age >= AGE_OF_MAJORITY) println( "Показать экран со скрытым контентом")
    else println("Вернуться на главный экран")
}
const val AGE_OF_MAJORITY = 18

