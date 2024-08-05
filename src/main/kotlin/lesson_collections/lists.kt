package lesson_collections

fun main() {
    //в отличии от массива, в неизменяемом списке нельзя менять значение элементов
    //    list[1] = 2
    //    val immutableArray = arrayOf(1, 2, 3)
    //    immutableArray[1] = 4
    // toMutableList, toImmutableList - можем менять списки на изменяемые и неизменяемые
    //но это будет уже другой список (исходный список не меняется)

    val list = listOf<Int>(1, 2, 3, 4)
    val carListImmutable = listOf<String>("Mercedes", "Renault", "Volvo")
    val mutableList = mutableListOf(1, 2, 3, 4)
    println(mutableList.size)
    mutableList[1] = 4
    mutableList.add(10)
    mutableList.add(12)
    println(mutableList.size)
    println(mutableList.lastIndex)

    println("------Разделитель------\n\n")

    for(i in list.indices) {
        println(list[i]*i)
    }

    println("------Разделитель------\n\n")
    list.forEach { item ->
        println(item)
    }

    println("------Разделитель------\n\n")
    list.forEachIndexed { index, item ->
        println("Индекс $index * элемент $item = ${index * item}")
    }

    println("------Разделитель------\n\n")
    //joinToString - выводит все элементы в строку, и разделяем их указанным символом
    println(mutableList.joinToString(";"))


    println("------Разделитель------\n\n")
    //сумма всех элементов массива умножаем на 5
    println(list.sumOf { it * 5 })
    println(carListImmutable.sumOf { it.length })



    val emptyList = listOf<String>()
    val secondEmptyList = emptyList<String>()

    //явно указываем кол-во элементов списка, и через лямбду инициализируем каждый элемент списка
    val listWithConstructor = List<Int>(5) { 0 }
    val carList = List<String>(3) {index -> "Car #$index"}

    println("------Разделитель------\n\n")
    val newStrList = list.map { //преобразуем список из одного типа в другой
        "This was a number $it"
    }
    newStrList.forEach{println(it)}

    val newMutableStrList = newStrList.toMutableList()
    newMutableStrList.add("One more line")
    newMutableStrList.forEach{println(it)}
}