package step8_collection

class ListEx {
}

fun main() {
    /*
    List<T>는 지정된 순서로 요소를 저장하고 인덱스된 액세스를 제공한다.
    첫번쨰 인덱스는 0
    마지막 인덱스는 (list.size - 1)로 가져올 수 있다.
     */
    val numbers = listOf("one", "two", "three", "four")
    println("Number of elements: ${numbers.size}")
    println("Third element: ${numbers.get(2)}")
    println("Fourth element: ${numbers[3]}")
    println("Index of element \"two\" ${numbers.indexOf("two")}")
    println("Last Index of List: ${numbers.size - 1}")

    println()

    /*
    List의 요소는 중복을 허용한다.
    List에는 동일한 개체와 단일 개체 모두 포함할 수 있다.
    만약 두 목록이 동일한 위치에 동일한 요소를 가지고 있다면 동일한 것으로 간주됩니다.
    ex. a1와 b1이 동일한 요소를 가지고 요소의 위치가 똑같다면 동일하다. 즉, a1 == b1 은 true다.
     */
    val bob = Person("Bob", 31)
    val people = listOf(Person("Adam", 20), bob, bob)
    val people2 = listOf(Person("Adam", 20), Person("Bob", 31), bob)
    println(people == people2)
    bob.age = 32
    println(people == people2)

    println()

    /*
    쓰기작업은 MutableList<T> 를 사용한다.
     */
    val numbers2 = mutableListOf(1, 2, 3, 4)
    numbers2.add(5)
    numbers2.removeAt(1)
    numbers2[0] = 0
    numbers2.shuffle()
    println(numbers2)

    // 코틀린 List의 기본 구현은 ArrayList
}

data class Person(var name: String, var age: Int)