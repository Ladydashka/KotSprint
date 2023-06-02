package lesson8

fun main() {
    val arrayOfIngredients = arrayOf("молоко", "яйца", "соль", "мука", "масло", "сахар")
    println("Введите навзание продукта для его поиска в рецепте")
    val ingredientName = readln()
    for (i in arrayOfIngredients) {
        if (i == ingredientName) {
            println("Ингредиент $ingredientName в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет.")
}


