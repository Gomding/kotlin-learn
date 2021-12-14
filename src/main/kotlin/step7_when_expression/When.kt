package step7_when_expression

import kotlin.random.Random

class When {
}

/*
when 표현식은 C언어의 switch문과 비슷하다.
분기가 여러개인 조건식을 정의할 때 사용한다.
 */
fun main() {
    // when 표현식 기본 사용 예시
    // 분기문에서 일치하는 것을 찾을 때 까지 순차적으로 비교합니다.
    val x = 2
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> {
            print("x is neither 1 nor 2")
        }
    }

    println()


    /*
    when 에서 어떤 분기도 만족하지 않으면 else 분기를 실행합니다.
    enum 이나 sealed 클래스 서브타입과 같이 가능한 모든 케이스가 분기 조건으로 명시됐다고 증명할 수 있는게 아니라면 else 블럭은 필수로 명시해야한다.
    */
    fun getRandomBit(): Bit {
        return Bit.values()[Random(0).nextInt(2)]
    }
    val numericValue = when (getRandomBit()) {
        Bit.ZERO -> 0
        Bit.ONE -> 1
        // Bit enum 클래스의 모든 요소를 분기처리 했으므로 else 블럭이 필요가 없다.
    }
    println("numericValue = $numericValue")

    /*
    when statement 에서 else 처리는 다음에서 필수이다.
    - when에는 boolean, enum 또는 sealed 또는 해당 null 가능한 대응 형식의 요소가 있습니다.
    - 모든 분기사항을 다 명시하지 않았을 때
    */
    val color = Color.RED
    when (color) {
        Color.RED -> println("red")
        Color.GREEN -> println("green")
        Color.BLUE -> println("blue")
        // Color enum 클래스의 모든 분기를 명시했으므로 else 블럭은 생략이 가능하다.
    }

    when (color) {
        Color.RED -> println("red") // Color 의 GREEN, BLUE 요소에 대한 분기 처리가 없다.
        else -> println("not red") // 따라서 else 블럭을 필수로 명시해야한다.
    }

    println()

    // 여러 분기에 대해 같은 동작을 정의할 때는 ',' 를 사용해서 한줄로 연결한다.
    print("여러 분기에 공통 동작을 정의할 때 : ")
    when (x) {
        0, 1 -> print("x == 0 or x == 1")
        else -> print("otherwise")
    }

    println()

    // 임의의 메서드를 분기에 사용할 수 있다.
    print("분기에 메서드를 사용 : ")
    val s = "2"
    when (x) {
        s.toInt() -> print("s encodes x")
        else -> print("s does not encode x")
    }

    println()

    // 범위를 분기로 할 수 있습니다.
    print("범위 분기를 사용 : ")
    val validNumbers = 30..40
    when (x) {
        in 1..10 -> print("x is in the range")
        in validNumbers -> print("x is valid")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }

    println()

    /*
    또 다른 옵션으로 is 또는 !is 가 있다.
    스마트 캐스트로 인해 해당 유형의 메서드 또는 필드에 접근할 수 있다.
     */
    print("is 와 !is 옵션 : ")
    fun hasPrefix(x: Any) = when(x) {
        is String -> x.startsWith("prefix") // String 으로 스마트 캐스팅하여 startsWith 메서드를 사용 가능
        else -> false
    }
    val z = "prefix something"
    println(hasPrefix(z))

    /*
    when 을 if-else, if chain의 대체물로 사용할 수 있다.
    인수를 제공하지 않으면 분기조건은 단순히 boolean 문이며 분기 조건이 true일 때 실행된다.
     */
    print("if-else나 if chain을 대체해서 사용 : ")
    val text = "start something"
    when {
        text.startsWith("start") -> print("text start with start")
        text.startsWith("something") -> print("text start with something")
        else -> print("x+y is odd")
    }
    println()

    // when 요소의 변수명을 캡쳐
//    fun Request.getBody() =
//        when (val response = executeRequest()) {
//            is Success -> response.body
//            is HttpError -> throw HttpException(response.status)
//        }
}

enum class Bit {
    ZERO, ONE
}

enum class Color {
    RED, GREEN, BLUE
}