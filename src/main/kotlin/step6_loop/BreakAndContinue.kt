package step6_loop

class BreakAndContinue {
}

// 코틀린은 전통적인 break와 continue를우 지원한다.
fun main() {
    // break 예제
    // while 반복문으로 6까지만 출력을 하고 멈춘다.
    var x = 9
    while(x > 0) {
        print(x)
        if (x == 6) break
        x--
    }

    println()

    // continue 예제
    // for문을 돌며 6보다 큰 숫자는 출력을 하지않는다.
    for(i in 10 downTo 1) {
        if (i > 6) continue
        print(i)
    }
}