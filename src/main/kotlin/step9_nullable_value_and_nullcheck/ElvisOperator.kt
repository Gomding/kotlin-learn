package step9_nullable_value_and_nullcheck

class ElvisOperator {
}

/*
nullable 참조인 b가 있을 때 "b가 null이 아니면 사용하고 그렇지 않으면 null이 아닌 값을 사용하십시오"라고 말할 수 있습니다.
 */
fun main() {
    val b: String? = "abc"
    val l: Int = if (b != null) b.length else -1
    println("if expression l = $l")

    // 위의 if 표현식을 엘비스 연산자로 표현할 수 있습니다.
    // b가 null이 아니면 ?:의 왼쪽에 있는 식을 실행하고 null이면 오른쪽의 값을 반환한다.
    // null인 경우에만 우항의 연산이 실행된다.
    val l2 = b?.length ?: -1
    println("Elvis Operator l2 = $l2")



}

// throw and return는 Kotlin의 표현식 이므로 Elvis 연산자의 오른쪽에도 사용할 수 있습니다.
// 예를 들어 함수 인수를 확인할 때 유용할 수 있습니다.
fun foo(str: String): String? {
    val parent = str.toString() ?: return null
    val name = str.toString() ?: throw IllegalArgumentException("name expected")
    // ...
    return name
}