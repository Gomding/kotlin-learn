package step2_function_and_variables

class VariablesPractice {
}

fun main() {
    println("a = $a, b = $b, c = $c")

    x += 1

    println("x = $x")
}

// val : 읽기 전용 지역 변수를 선언하는 키워드. 최초 한 번만 값을 할당 할 수 있다.
val a: Int = 1
val b = 2
val c: Int = 0

// val c: Int -> 초기화 안된 필드를 만드는건 불가능한가??

// var : 재할당할 수 있는 변수를 선언한느 키워드
var x = 5

val PI = 3.14
var y = 0

fun incrementY() {
    y += 1
}