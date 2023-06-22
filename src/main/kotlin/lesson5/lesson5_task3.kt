package lesson5

fun main(){
    println("Для участия в лотерее введите 2 числа от 1 до 100")
    val number1 = readLine()?.toInt()
    val number2 = readLine()?.toInt()

   when{
       (number1 == FIRST_NUMBER && number2 == SECOND_NUMBER) || (number1 == SECOND_NUMBER && number2 == FIRST_NUMBER) -> println("Поздравляем! Вы выиграли главный приз!")
       number1 == FIRST_NUMBER || number2 == SECOND_NUMBER || number1 == SECOND_NUMBER || number2 == FIRST_NUMBER -> println("Вы выиграли утешительный приз!")
       else -> println("Неудача! Крутите барабан!\nНомера победители 21 и 49")
   }
}
const val FIRST_NUMBER = 21
const val SECOND_NUMBER = 49
