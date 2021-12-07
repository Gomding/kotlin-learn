package step3_class

// 클래스의 속성은 선언 또는 본문에 나열될 수 있습니다.
class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2
}

fun main() {
    // 클래스 선언에 나열된 매개 변수를 가진 기본 생성자를 자동으로 활용할 수 있습니다.
    val rectangle = Rectangle(5.0, 2.0)
    println("The Perimeter is ${rectangle.perimeter}")
}