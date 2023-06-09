package lesson8
fun main() {
    val arrayOfIngredients = arrayOf("молоко", "яйца", "соль", "мука", "масло", "сахар")
    println(arrayOfIngredients.contentToString())
    println("Введите навзание продукта для замены")
    val ingredientName = readln()
    val isElementInArray = arrayOfIngredients.contains(ingredientName)
    if (!isElementInArray) println(" Ингредиент $ingredientName есть в списке: $isElementInArray")
    else println("Введите название ингредиента, который  необходимо  добавить")
    val ingredientNameToReplace = readln()
    arrayOfIngredients.set(arrayOfIngredients.indexOf(ingredientName),ingredientNameToReplace)
    println("Готово! Вы сохранили следующий список: ${arrayOfIngredients.contentToString()}")
}



