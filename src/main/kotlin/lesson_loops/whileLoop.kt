package lesson_loops

fun main() {

    var number = -1
    while (number < 1) {
        print("Введите натуральное число: ")
        number = readln().toInt()
    }
    println("Ура! Вы ввели верное число: $number")

    var secondNumber: Int
    do {
        print("Введите натуральное число: ")
        secondNumber = readln().toInt()
    } while(secondNumber < 1)
    println("Ура! Вы ввели верное число: $number")
}