package step3_class

// class :  클래스를 위한 키워드
class ClassEx {
}

// 클래스는 기본적으로 불변(final) 이다. 상속이 가능한 클래스는 open 이라는 키워드를 선언합니다.
open class Shape2 {
}

// 클래스 선언은 클래스 이름, 클래스 헤더(유형 매개 변수, 주 생성자 및 기타 사항 지정) 및 중괄호로 둘러싸인 클래스 본문으로 구성됩니다.
// 헤더와 본문은 모두 선택 사항이며 클래스에 본문이 없는 경우 중괄호를 생략할 수 있습니다.
// 클래스의 속성(Property)은 선언 또는 본문에 나열될 수 있습니다.
class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2
}

fun main() {
    // 클래스 선언에 나열된 매개 변수를 가진 기본 생성자가 자동으로 생성됩니다.
    // 아래는 기본생성자를 사용하는 코드입니다.
    val rectangle = Rectangle(5.0, 2.0)
    println("The Perimeter is ${rectangle.perimeter}")
}

// 클래스간의 상속은 ':' 으로 선언됩니다.
class Rectangle2(var height: Double, var length: Double): Shape2() {
    var perimeter = (height + length) * 2
}

// 몸체가 없다면 중괄호를 생략해도 된다.
class Empty