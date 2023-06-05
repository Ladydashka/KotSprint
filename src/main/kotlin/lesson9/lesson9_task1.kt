package lesson9

fun main(){
   val list = mutableListOf("молоко","мука","яйца","соль","сахар")
    println("В списке есть ингредиенты $list ")

     list.forEach {
         println(it)
     }

}