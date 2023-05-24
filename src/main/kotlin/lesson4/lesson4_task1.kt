package lesson4

fun main(){
    val reservedTablesToday = 13 >= TOTAL_TABLES
    val reservedTablesTomorrow = 4 >= TOTAL_TABLES
    println("[Доступность столиков на сегодня: $reservedTablesToday],\n[Доступность столиков на завтра: $reservedTablesTomorrow]")

}
const val TOTAL_TABLES = 13