package step6_loop

class WhileLoop {
}

// while 반복문
// while 과 do-while 이 존재
// 이들의 차이점은 상태 점검 시점이다.
// while은 상태 점검 -> 본문 실행 -> 상태 점검 -> 본문 실행 -> ... 의 순서로 반복된다.
// do-while은 본문 실행 -> 상태 점검 -> 본문 실행 -> ... 의 순서로 반복된다. 즉, 최초 한번의 실행은 보장한다.
fun main() {
    // while문 예시
    println("while문 예시")
    var x = 10;
    while (x > 0) {
        print(x)
        x--
    }

    println()

    // do-while문 예시
    println("do-while문 예시")
    var y = 0
    do {
        print(y)
        y--
    } while (y > 0) // y 의 값은 0이지만 본문이 한번은 실행된다!!

    println()

    val items = listOf("apple", "banana", "kiwifruit")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
}