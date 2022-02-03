package step3_class

import org.jetbrains.annotations.Nullable

class ConstructorEx {
}

/*
Kotlin 의 클래스는 주 생성자(primary constructor)와 하나 이상의 보조 생성자(secondary constructor)를 가질 수 있습니다.
주 생성자는 클래스 헤더의 일부이며 클래스 이름과 선택적 유형 매개 변수 뒤에 옵니다.
 */
class Person constructor(firstName: String) {
}

/*
주 생성자에 애너테이션 또는 접근 제한자가 없는 경우 constructor 키워드를 생략할 수 있습니다.
 */
class Person2 (firstName: String) {
}

/*
주 생성자는 코드를 포함할 수 없습니다.(몸체가 없음)
초기화 코드는 init 키워드 앞에 초기화 블록에 넣을 수 있습니다.
 */
class Person3 (firstName: String) {
    init {
        println(firstName)
    }
}

fun main() {
    val p2 = Person3("charlie")
    /* 출력 결과
    charlie
     */

    val initOrderDemo = InitOrderDemo("charlie")
    /* 출력 결과
    First property: hello
    First initializer block that prints hello
    Second property: 5
    Second initializer block that prints 5
     */
}

// 인스턴스를 초기화하는 동안 초기화 블록은 클래스 본문(body)에 나타나는 것과 동일한 순서로 실행되며
// Property 초기화와 인터리빙 됩니다.
class InitOrderDemo(name: String) {
    val firstProperty = "firstProperty: $name".also(::println)

    init {
        println("첫 초기화 블럭 출력 $name")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("두 번째 초기화 블럭 출력 ${name.length}")
    }
}

// 기본 생성자 매개변수는 이니셜라이저 블록에 사용할 수 있습니다.
// 클래스 본문에 선언된 속성 이니셜라이저에도 사용할 수 있습니다.
class Customer(name: String) {
    val customerKey = name.uppercase()
}

// 코틀린은 속성을 선언하고 주 생성자에서 초기화하는 간결한 구문을 가지고 있습니다.
// 일반 속성과 마찬가지로 주 생성자에 선언된 속성은 가변(var) 또는 읽기 전용(val)일 수 있습니다.
class User(val firstName: String, val lastName: String, var age: Int)

// 또한 주 생성자에서 값을 바로 초기화할 수도 있습니다.
class User2(val firstName: String, val lastName: String, var isEmployed: Boolean = true)

// 클래스의 속성을 선언할 때 후행 쉽표(trailing comma)를 사용할 수 있습니다.
class User3(
    val firstName: String,
    val lastName: String,
    var age: Int, // <= 후행 쉽표
)

/*
후행 쉼표란?

요소 중 마지막 요소 뒤에 사용되는 쉼표(,) 입니다.

후행 쉼표를 사용함으로써 얻을 수 있는 장점
- 변경된 값에 집중할 수 있어서 버전 컨트롤의 차이를 더욱 깔끔하게 만들어줍니다.
- 요소를 추가할 때 쉼표를 추가할 필요가 없습니다.

후행 쉼표는 전적으로 선택 사항입니다.
후행 쉼표는 없어도 코드는 정상 작동합니다.
Kotlin 스타일 가이드는 선언 사이트에서 후행 쉼표를 사용하도록 권장하고, 이는 사용자의 재량 또는 팀의 컨벤션에 따라 달라질 수 있습니다.
 */

// 주 생성자에 애너테이션이나 접근제한자가 있는 경우 constructor 키워드가 필요하며 수정자가 그 앞에옵니다.
class Customer2 public @SafeVarargs constructor(name: String) { /*...*/ }

