package step9_nullable_value_and_nullcheck

class SafeCall {
}

fun main() {
    // Safe Call
    // nullable 변수에 접근하는 방법은 Safe Call 연산자 '?' 를 사용하는 것이다.
    val a = "Kotlin"
    val b: String? = null
    println(b?.length)
    println(a?.length) // Unnecessary safe call

    // Safe Call은 chain 에서 유용하게 사용된다.
    // 다음과 같이 사용될 수 있다.
    // bob?.department?.head?.name
    // 위 예제는 속성중 하나라도 null이면 null을 반환한다.

    println()

    /*
    null이 아닌 값에 대해서만 특정 작업을 수행하려면 Safe Call 연산자 '?'와 함께 let 을 사용할 수 있다.
     */
    val listWithNulls: List<String?> = listOf("Kotlin", null)
    for (item in listWithNulls) {
        item?.let { println(it) } // prints Kotlin and ignores null
    }

    // Safe Call은 다음과 같이 사용이 가능합니다.
    // 속성 중 하나라도 null이 있다면 할당을 건너뛰고 우항도 실행되지 않습니다.
    // person?.department?.head = managersPool.getManager()
}