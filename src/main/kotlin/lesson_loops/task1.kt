package lesson_loops

fun main() {
//    countWithWhile()
    countWithFor()
}

fun countWithWhile() {
    var counter = 1
    while(counter <= 2030) {
        println(counter)
        counter++
    }
    println("End")
}

fun countWithFor() {
//    for (i in 1..2030) {
//        println(i)
//    }

//    for (i in 2030 downTo 1) {
//        println(i)
//    }

    for (i in 0..40 step 10) {
        println(i)
    }
    println("End")
}