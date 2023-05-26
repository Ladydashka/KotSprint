package lesson5

fun main(){
    println("Для входа введите логин")
    val login = readLine()
    if (login == LOGIN_ID_111111) println("Введите пароль")
    else println("Необходимо зарегестрироваться")

    val password = readLine()
    if (password == PASSWORD_ID_11111) println("Приветственное сообщение")
    else println("Ошибка авторизацииgffg")
}
const val LOGIN_ID_111111 ="Batman"
const val PASSWORD_ID_11111 = "password"

