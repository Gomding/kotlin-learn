package step8_collection

class SetEx {
}

fun main() {
    /*
    Set은 고유한 요소를 저장하며, 순서는 일반적으로 저장되지 않는다.
    null 요소도 고유한 것으로 취급한다.
    요소의 개수가 같고, 요소가 같다면 (위치는 상관 없음) 같은 객체로 취급한다.
     */
    val numbers = setOf(1, 2, 3, 4)
    println("Number of elements: ${numbers.size}")
    if (numbers.contains(1)) println("1 is in the set")

    val numbersBackwards = setOf(4, 3, 2, 1)
    println("The sets are equal: ${numbers == numbersBackwards}")

    // MutableSet은 쓰기 작업을 지원합니다.

    println()

    /*
    LinkedHashSet은 요소의 순서 삽입 순서를 저장합니다.
     */
    val numbers2 = setOf(1, 2, 3, 4)  // LinkedHashSet is the default implementation
    val numbersBackwards2 = setOf(4, 3, 2, 1)

    println(numbers2.first() == numbersBackwards2.first())
    println(numbers2.first() == numbersBackwards2.last())
}