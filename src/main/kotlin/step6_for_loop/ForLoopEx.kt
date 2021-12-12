package step6_for_loop

class ForLoopEx {
}

fun main() {

    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) println(item)

    // 하나의 block으로 만들 수도 있습니다.
    val items2 = listOf("apple", "banana", "kiwifruit")
    for (index in items2.indices) {
        println("item at $index is ${items2[index]}")
    }

    // iterator를 제공하는 모든 것에 반복문을 사용할 수 있다.
    // 이는 다음을 의미합니다.
    // 1. Iterator<> 를 반환하는 멤버나 확장 함수 iterator() 가 있다.
    // 1-1. 멤버나 확장 함수 next() 가 있다.
    // 1-2. boolean을 반환하는 멤버나 확장 함수 hasNext() 가 있다.


    // 숫자 범위를 표현하려면 범위 표현식을 사용한다.
    for (i in 1..3) {
        println(i)
    }
    for (i in 6 downTo 0 step 2) {
        println(i)
    }
}