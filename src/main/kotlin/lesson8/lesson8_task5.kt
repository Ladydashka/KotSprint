package lesson8

fun main() {
    println("Введите количество планируемых ингредиентов")
    val countOfIngredients = readln().toInt()

    val array = arrayOfNulls<String>(countOfIngredients)
    for (i in 0 until countOfIngredients) {
        array.set(i, readln())
    }
}