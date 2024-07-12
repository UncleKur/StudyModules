package lesson_recursion

fun main() {

    val n = readln().toInt()
    printNumber(n)

}

fun printNumber(n: Int): Int {
    return if (n > 0) {
        println(n)
        printNumber(n - 1)
    } else 0
}