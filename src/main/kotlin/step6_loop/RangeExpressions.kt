package step6_loop

class RangeExpressions {
}

// 코틀린에서는 Kotlin.ranges 패키지와 해당 연산자 형식의 rangeTo() 함수를 사용하여 값 범위를 쉽게 만들 수 있습니다.
// 일반적으로 rangeTo()는 in 또는 !in 함수로 보완된다.
fun main() {
    // if 문에도 사용할 수 있다.
    val i = 1
    if (i in 1..4) print(i) // 다음과 같다. <= i && i <= 4

    println()

    // 숫자를 역순으로 반복하려면 downTo 함수를 사용한다.
    // downTo 뒤에 오는 숫자는 어디까지 줄일지를 의미한다.
    // 아래 예제에서는 4부터 시작해서 숫자 1까지 줄이겠다는 뜻이다.
    for (j in 4 downTo 1) print(j)

    println()

    // 임의의 step으로 반복할 수 있습니다.
    // 예를들어 step2는 2씩 증가시키거나 감소시킨다는 의미입니다.
    for (k in 1..8 step 2) print(k)
    println()
    for (k in 8 downTo 1 step 2) print(k)
    println()
    for (k in 8 downTo 6 step 2) print(k)

    println()

    // rangeTo 함수를 사용하면 끝 요소를 포함합니다.
    // 만약 끝 요소를 포함하고 싶지 않다면 until 함수를 사용합니다.
    for (p in 1 until 10) {       // i in [1, 10), 10 은 포함하지 않는다.
        print(p)
    }
}