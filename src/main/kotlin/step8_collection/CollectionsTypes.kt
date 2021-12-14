package step8_collection

class CollectionsTypes {
}

fun main() {
    /*
    Kotlin Standard Library는 List, Set, Map 같은 기본 컬렉션 유형을 위한 구현을 제공합니다.
    인터페이스 쌍은 각 컬렉션의 유형을 나타냅니다.
    - 읽기 전용 인터페이스는 각 컬렉션 요소에 접근하기 위한 작업을 제공합니다.
    - 변경 가능 인터페이스는 추가, 수정, 삭제 같은 쓰기작업을 통해 읽기 전용 인터페이스를 확장합니다.

    컬렉션은 var 변수로 선언할 필요가 없습니다. 동일한 컬렉션 객체에 쓰기작업을 하는 것으로 참조값은 변경되지 않습니다.
    컬렉션을 val로 선언했을떄 재할당하려고 하면 컴파일 오류가 발생
     */
    val numbers = mutableListOf("one", "two", "three", "four")
    numbers.add("five")   // 요소 추가는 참조값이 변경되지 않음
    println(numbers)
    //numbers = mutableListOf("six", "seven")      // val 변수의 참조값을 변경하려고 했으므로 컴파일 에러

    println()

    // 읽기 전용 유형은 공변입니다. Rectangle 클래스가 Shape 클래스의 하위 클래스라면(class Rectangle extends Shape)
    // List<Rectangle>은 List<Shape>에서 사용할 수 있습니다.
    // Collection<T>는 읽기 전용 컬렉션 인터페이스 입니다. Iterable로 부터 상속됩니다.
    val stringList = listOf("one", "two", "one")
    printAll(stringList)

    val stringSet = setOf("one", "two", "three")
    printAll(stringSet)

    println()

    // MutableCollection<T>는 쓰기 작업이 포함된 컬렉션 입니다.
    val words = "A long time ago in a galaxy far far away".split(" ")
    val shortWords = mutableListOf<String>()
    words.getShortWordsTo(shortWords, 3)
    println(shortWords)
}

fun printAll(strings: Collection<String>) {
    for(s in strings) print("$s ")
    println()
}

fun List<String>.getShortWordsTo(shortWords: MutableList<String>, maxLength: Int) {
    this.filterTo(shortWords) { it.length <= maxLength }
    // throwing away the articles
    val articles = setOf("a", "A", "an", "An", "the", "The")
    shortWords -= articles
}