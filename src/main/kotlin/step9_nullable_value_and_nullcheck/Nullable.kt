package step9_nullable_value_and_nullcheck

class Nullable {
    /*
    코틀린에서 NPE(NullPointerException)이 발생하는 경우는 다음과 같습니다.
    - throw NullPointerException() 을 명시적으로 호출한 경우
    - '!!' 연산자를 사용한 경우
    - 초기화 관련 데이터 불일치
      + 생성자에서 초기화되지 않고 어딘가에서 사용된 경우
      + 슈퍼 클래스의 생성자는 파생 클래스의 구현이 초기화되지 않은 상태에서 open member를 호출합니다.
    자바와 상호운영 할 때도 문제가 발생할 수 있습니다.
    - 플랫폼 유형의 null 참조에 대한 접근 시도
    - 자바는 제네릭에서 null을 허용. 따라서 null이 들어가지 않도록 하려면 다음과 같이 한다.
      + MutableList<String> -> MutableList<String?>
    - 기타 자바 코드로 인한 문제가 발생할 수 있음


     */
}

/*
코틀린에서 null 값을 허용할 때 명시적으로 nullable을 표시해야합니다.
Nullable 타입 이름은 끝에 ? 으로 끝납니다.
*/
fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    // x 또는 y에 null이 가능하므로 체크해야한다.
    if (x != null && y != null) {
        // null 체크 후에는 자동으로 non-nullable로 캐스팅 됩니다.
        println(x * y)
    }
    else {
        println("'$arg1' or '$arg2' is not a number")
    }
}

fun printProduct2(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    // ...
    if (x == null) {
        println("Wrong number format in arg1: '$arg1'")
        return
    }
    if (y == null) {
        println("Wrong number format in arg2: '$arg2'")
        return
    }

    // null 체크 후에는 자동으로 non-nullable로 캐스팅 됩니다.
    println(x * y)
}

fun main() {
    println("printProduct 메서드 실행")
    printProduct("6", "7")
    printProduct("a", "7")
    printProduct("a", "b")

    println()

    println("printProduct2 메서드 실행")
    printProduct2("6", "7")
    printProduct2("a", "7")
    printProduct2("a", "b")

    /*
    코틀린은 null을 보유할 수 있는 참조와 null을 보유할 수 없는 참조를 구분함
    String Type의 정규 변수는 null을 가질 수 없다.
     */
    var a: String = "abc"
    // a = null 해당 코드는 컴파일에서 에러가 발생

    // null을 허용하려면 타입 끝에 '?' 를 명시한다.
    var b: String? = "abc"
    b = null // 정상적으로 컴파일 됨
    println(b)

    println()

    // a 는 null이 아님을 보장하므로 다음이 가능하다.
    val al = a.length

    // b 는 null을 허용하므로 안전하지 않다. 따라서 컴파일러는 오류를 보고한다.
    // val bl = b.length 컴파일 에러 발생!! Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?

    // null을 햐용함에도 b.length와 같은것에 접근하는 경우 방법이 있다.
    /*
    null을 체크하는 것
    b의 null 여부를 체크할 수 있다.
     */
    val bl = if (b != null) b.length else -1
    // 컴파일러는 null 체크에 대한 정보를 추적하고 length 호출을 허용한다.

    println()

    // 다음과 같이 긴 문장에도 적용이 된다.
    // 다음은 c가 불변인 경우에만 적용된다. val 변수로 선언했으므로 이후 변경되지 않는다는 것을 보장하기 때문
    val c: String? = "Kotlin"
    if (c != null && c.length > 0) {
        print("String of length ${c.length}")
    } else {
        print("Empty string")
    }
}

