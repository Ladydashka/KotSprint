package lesson8
fun main() {
    val arrayOfIngredients = arrayOf("молоко", "яйца", "соль", "мука", "масло", "сахар")
    println("Введите навзание продукта для его поиска в рецепте")
    val ingredientName = readln()
    val isElementInArray = arrayOfIngredients.contains(ingredientName)
    if (isElementInArray) println(" Ингрединт $ingredientName есть в рецепте: $isElementInArray")
    else println(" Ингрединт $ingredientName есть в рецепте: $isElementInArray")
}