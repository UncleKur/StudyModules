package lesson_recursion

fun main() {

    println(printNNumbers(15))
    calcGausSum(100)

}

fun printNNumbers(n: Int) {
    if (n <= 0) { // проверяем, не меньше ли число нуля;
        println() // если да, переводим курсор на другую строку;
        return // выходим из рекурсии.
    }
    print("$n ") // шаблон и пробел после числа.
    printNNumbers(n - 1)
}

fun calcGausSum(n: Int): Int {
    if (n == 0) return 0
    val next = n + calcGausSum(n - 1)
    println("n = $n, next value = $next")
    return next
}