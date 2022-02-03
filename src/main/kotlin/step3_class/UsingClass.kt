package step3_class

class UsingClass {
}

class Dog(name: String) {

}

// 클래스의 인스턴를 만들려면 생성자를 정규 함수처럼 호출하시면 됩니다.
// 코틀린은 new 키워드가 없습니다.
fun main() {
    val example = UsingClass();
    val dog = Dog("귀여운 강아지")
}

 /*
 클래스는 다음의 요소를 포함할 수 있습니다.
 - 생성자와 초기화 블럭
 - 함수
 - 속성
 - 중첩과 내부 클래스
 - 객체 표현식
 */