package step7_when_expression

class ExpressionAndStatement {
}

fun main() {
    /*
    코틀린에서의 표현식과 구문 (expression and statement)
    표현식
    - 변수, 상수, 연산자, 함수로 구성되어 무언가 값을 만드는 문장을 의미
    - 결과값이 있다.
    - 값을 반환하므로 대입 연산자(=)의 우항에 위치할 수 있다.
    구문식
    - 무언가가 실행되도록 명령을 실행하는 문장을 의미
    - 결과값이 없다.
     */

    // 표현식
    // 반환값이 있다.
    print("표현식 예제 : ")
    val a = 1
    var result = when (a) {
        1 -> 100
        2 -> 200
        else  -> 300
    }
    println("result = $result")

    // 구문
    print("구문 예제 : ")
    when (a) {
        3 -> println("a == 3")
        2 -> println("a == 2")
        1 -> println("a == 1")
    }
}