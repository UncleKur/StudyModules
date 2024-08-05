package lesson_collections

import kotlin.random.Random

fun main() {

    //solutionOne()
    //solutionTwo()
    solutionThree()

}

/**
 * Исходная задача
 * ConcurrentModificationException - ошибка возникает при попытке модификации коллекции во время обхода её в цикле
 * в основном это связано с нарушением индексации
 * решение задачи в других функциях
 */
fun task() {
    val numbers = MutableList(10) { Random.nextInt(-10, 10) }
    println(numbers)
    numbers.forEach {
        if (it < 0)
            numbers.remove(it)
    }
    println(numbers)
}

/**
 * используем промежуточный список
 */
fun solutionOne() {
    val numbers = MutableList(10) { Random.nextInt(-10, 10) }
    println(numbers)
    val candidateToRemove = mutableListOf<Int>()
    numbers.forEach {
        if (it < 0)
            candidateToRemove.add(it)
    }
    numbers.removeAll(candidateToRemove)
    println(numbers)
}

/**
 * Более классичесский вариант, с использованием итератора*/
fun solutionTwo() {
    val numbers = MutableList(10) { Random.nextInt(-10, 10) }
    println(numbers)
    val iterator = numbers.iterator() //не привязан к индексам
    while (iterator.hasNext()) { //hasNext() - Boolean, проверяем есть ли ещё элементы в коллекции
        val item = iterator.next() //берём элемент на который сейчас указывает итератор
        if (item < 0) //проверяем его на положительность
            iterator.remove() //если элемент отрицательный - удаляем его с помощью итератора из коллекции
    }
    println(numbers)
}

/**
 * Через функцию высшего порядка - removeAll{}
 * принимает выражение с правилом, по которому будут удаляться элементы.*/
fun solutionThree() {
    val numbers = MutableList(10) { Random.nextInt(-10, 10) }
    println(numbers)
    numbers.removeAll { it < 0 } //значение меньше нуля? - удалить элемент из коллекции
    println(numbers)
}