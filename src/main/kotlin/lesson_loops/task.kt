package lesson_loops

import kotlin.random.Random

fun main() {

    val hiddenNumber = Random.nextInt(20) + 1
    var tryCount = 0
    println("Компьютер загадал число! Попробуй угадать")

    do {
        //вводим данные
        val userNumber = getUserNumber()
        ++tryCount
        when {
            userNumber == hiddenNumber -> {
                println("Вы угадали, было загадано число: $hiddenNumber")
                println("Количество попыток $tryCount")
                return
            }

            hiddenNumber > userNumber -> {
                println("Загаданное число больше")
            }

            else -> {
                println("Загаданное число меньше")
            }
        }
    } while (true)
}

fun getUserNumber(): Int {
    do {
        print("Введите число от 1 до 20: ")
        val number = readln().toInt()
        if (number < 1 || number > 20) {
            println("Некорректный ввод!")
        } else {
            return number
        }
    } while (true)
}