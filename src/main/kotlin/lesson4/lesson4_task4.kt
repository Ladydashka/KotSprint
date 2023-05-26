package lesson4

fun main(){
    val day = 2
    val choiceOfExercise = day % 2 == 0
    println("Упражнения для рук: ${!choiceOfExercise}\n" +
            "Упражнения для ног: ${choiceOfExercise}\n" +
            "Упражнения для спины:${choiceOfExercise}\n" +
            "Упражнения для пресса:${!choiceOfExercise} ")
}

