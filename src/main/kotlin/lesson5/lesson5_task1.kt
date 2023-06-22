package lesson5

fun main(){
    val example = "2 + 2"
    val correctAnswer = 4
    println("Для входа в приложение необходимо сложить $example и ввесли ответ")
    val number = readln().toInt()
    if (number == correctAnswer) println("Добро пожаловать!")
    else println("Доступ запрещен")
}