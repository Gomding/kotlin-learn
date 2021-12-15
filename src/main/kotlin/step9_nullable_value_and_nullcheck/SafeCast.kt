package step9_nullable_value_and_nullcheck

class SafeCast {
}

/*
일반적인 캐스팅을 사용하면 ClassCastException이 발생할 수 있습니다.
Safe Cast 를 사용하면 타입 캐스트에 성공하지 못한 경우 null을 반환하는 안전한 캐스트를 사용할 수 있습니다.
 */
fun main() {
    val a: String? = null
    val aInt: Int? = a as? Int
    println(aInt)
}
