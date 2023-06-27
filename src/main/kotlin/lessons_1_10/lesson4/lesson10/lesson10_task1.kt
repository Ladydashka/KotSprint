package lessons_1_10

 fun main() {
  val player = getValue()
  val pc = getValue()

  println("Игрок бросил кости. Значение кубиков $player")
  println("Компьютер бросил кости. Значение кубиков $pc")

  when {
   player > pc -> println("Победило человечество.")
   pc > player -> println("Победила машина.")
   player == pc -> println("Необходимо бросить кубики еще раз")
  }
 }

  fun getValue(): Int {
   val value1 = (1..6).random()
   val value2 = (1..6).random()
   return value1 + value2
  }