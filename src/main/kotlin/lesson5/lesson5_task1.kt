package lesson5

fun main(){
    println("Для входа в приложение необходимо сложить 2 + 2 и ввесли ответ")
    val number = readLine()!!.toInt()
    if (number == 4) println("Добро пожаловать!")
    else println("Доступ запрещен")
}