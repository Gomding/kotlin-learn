package step9_nullable_value_and_nullcheck

class TheDoubleExclamationPointOperator {
}

/*
!! 연산자는 NPE를 좋아하는 사람을 위한 것이다.
null이 아닌 값은 반환하고 null이면 예외를 던집니다.
 */
fun main() {
    val b: String? = null
    val l = b!!.length // NPE를 던짐
}
