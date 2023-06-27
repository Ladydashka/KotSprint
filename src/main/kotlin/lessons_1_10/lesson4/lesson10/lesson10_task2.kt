package lessons_1_10

fun main(){
    val login =  checkLength(readln())
    val password = checkLength(readln())

    when{
        login && password -> println("Добро пожаловать")
        login || password -> println("Логин или пароль недостаточно длинные")
    }
}
fun checkLength(str : String) : Boolean{
    return str.length >= 4
}