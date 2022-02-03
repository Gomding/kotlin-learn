package step3_class

class SecondaryConstructor {
}

// 클래스는 보조 생성자(Secondary Constructor)도 선언할 수 있다.
class Account(val pets: MutableList<Pet> = mutableListOf())

// 예시를 위해 주 생성자를 생성하지 않았음
class Pet {
    constructor(owner: Account) {
        owner.pets.add(this) // adds this pet to the list of its owner's pets
    }
}

// 클래스가 주 생성자를 가지고 있다면, 각 보조 생성자는 직접적으로 또는 다른 보조생성자를 간접적으로 사용해서 주 생성자에게 위임해야 한다.
// 다른 생성자에 대한 위임은 this 키워드를 사용합니다.
class Parent(val name: String) {
    private val children: MutableList<Parent> = mutableListOf()
    constructor(name: String, parent: Parent) : this(name) {
        parent.children.add(this)
    }
}

// 초기화 블럭 내 코드는 주 생성자의 일부가 되어 동작합니다.
// 보조 생성자에서 주 생성자로의 위임은 보조 생성자의 첫 번째 줄에서 발생합니다.
// 즉, 보조 생성자의 본문보다 초기화 블럭과 속성 초기화 코드는 보조 생성자의 본문 보다 먼저 실행됩니다.
// 순서 : 보조 생성자 호출 -> 첫번째 문장에서 주 생성자에 위임 -> 초기화 블럭, 속성 초기화 코드 실행 -> 보조 생성자 본문 실행
class ConstructorsEx {
    init {
        println("Init block")
    }

    constructor(i: Int) {
        println("Constructor $i")
    }

    // 출력 결과
    // Init block
    // Constructor 1
}

// 추상 클래스가 아니고, 어떤 생성자도 선언하지 않는다면 (주 생성자, 보조 생성자 모두)
// 인수가 없고 접근제한자가 public 인 기본 생성자를 가지게 됩니다.
// 이렇게 자동 생성되는 생성자가 싫다면 직접 생성자를 선언해줘야 합니다.