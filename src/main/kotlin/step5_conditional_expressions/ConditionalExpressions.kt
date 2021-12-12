package step5_conditional_expressions

class ConditionalExpressions {
}

/*
* 코틀린에서 if는 표현식이다.
* 따라서 코틀린에 삼항 연산자는 없다.
* */
fun main() {
    val a = 100
    val b = 1
    println("maxOf(a, b) is ${maxOf(a, b)}")

    val c = 1
    val d = 100
    println("maxOf(c, d) is ${maxOf(c, d)}")

    // if-expressions
    var max = a
    if (a < b) max = b

    // With else
    var max2: Int
    if (a > b) {
        max2 = a
    } else {
        max2 = b
    }

    // As expression
    val max3 = if (a > b) a else b

    // 값을 반환하거나 변수에 할당하는 등의 표현식으로 if를 사용하는 경우 다른 분기는 필수입니다.
    val max4 = if (a > b) {
        print("Choose a")
        a
    } else {
        print("Choose b")
        b
    }
}

fun maxOf(a: Int, b: Int): Int {
    // if 조건식 표현법
    if (a > b) {
        return a
    } else {
        return b
    }
}

// 코틀린에서는 if도 표현식으로 사용할 수 있다.
fun maxOf2(a: Int, b: Int): Int = if (a > b) a else b