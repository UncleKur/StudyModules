package lesson_recursion
//нахождение суммы чисел от 0 до n

fun main() {

    val n = readln().toInt()
    println(calculateSum(n))

}

//fun calculateSum(n: Int): Int {
//    if (n == 0) return 0
//    return n + calculateSum(n - 1)
//}

tailrec fun calculateSum(n: Int, currentSum: Int = 0): Int {
    if (n == 0) return currentSum
    return calculateSum(n - 1, currentSum + n)
}