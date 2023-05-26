package lesson5
fun main(){
    println("Для участия в лотерее введите 2 числа от 1 до 100")
    val number1 = readLine()?.toInt()
    val number2 = readLine()?.toInt()
    val firstNumber = (Math.random() * 100).toInt()
    val secondNumber = (Math.random() * 100).toInt()

    when{
        number1 == firstNumber && number2 == secondNumber -> println("Поздравляем! Вы выиграли главный приз!")
        number1 == firstNumber || number2 == secondNumber -> println("Вы выиграли утешительный приз!")
        else -> println("Неудача! Крутите барабан!\nНомера победители $firstNumber и $secondNumber")
    }
}



