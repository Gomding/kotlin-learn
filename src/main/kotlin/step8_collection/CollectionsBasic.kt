package step8_collection

class Collections {
}

/*
Kotlin Standard Library는 문제 해결을 위해 컬렉션 그룹을 관리하기 위한 다양한 방법을 제공합니다.
여기서 말하는 컬렉션은 자바나 파이썬등에서 말하는 컬렉션과 동일하다.
다음의 컬렉션이 있습니다.
- List 인덱스로 요소에 접근, 정렬된 순서
- Set 중복된 요소를 허용하지 않음, 순서가 없다.
- Map 키-값 쌍으로 요소를 관리
컬렉션 인터페이스 및 관련 기능은 kotlin.collections 패키지에 있습니다.
 */
fun main() {
    // 컬렉션을 반복해서 읽는다.
    println("예제1 : 컬렉션을 반복해서 읽는다.")
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }

    println()

    // in 키워드를 사용해서 컬렉션 내부에 값이 있는지 여부를 판단한다.
    println("예제2 : in 키워드를 사용해서 컬렉션 내부에 값이 있는지 여부를 판단한다.")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }

    println()

    // 람다 표현식을 사용해서 집합을 필터링하고 매핑하는 방법
    println("예제3 : 람다 표현식을 사용해서 집합을 필터링하고 매핑하는 방법")
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }

    println()


}

