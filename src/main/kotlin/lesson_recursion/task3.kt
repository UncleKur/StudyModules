package lesson_recursion

fun main() {

    println(isValid("[()[{()}][]]"))

}

fun isValid(s: String): Boolean {
    println("processing $s")
    if (s.isEmpty()) return true
    val removed = s.replace("()", "")
        .replace("[]", "")
        .replace("{}", "")
    if(removed.length == s.length) return false
    return isValid(removed)
}