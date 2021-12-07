class FunctionPractice {
}

fun main() {
    println(sum(1,2))
    println(sum2(1,2))
    printSum(1,2)
    printSum2(1,2)
}

fun sum(a: Int, b: Int): Int {
    return a + b;
}

fun sum2(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun printSum2(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}
