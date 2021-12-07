class ExtendsPractice {
}

// 클래스는 기본적으로 final 이다. 상속이 가능한 클래스는 open 이라는 키워드를 선언합니다.
open class Shape2 {

}

// 클래스간의 상속은 ':' 으로 선언됩니다.
class Rectangle2(var height: Double, var length: Double): Shape2() {
    var perimeter = (height + length) * 2
}