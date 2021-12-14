package step8_collection

class Map {
}

fun main() {
    /*
    Map<K, V>는 컬렉션 인터페이스의 상속자는 아니지만 코틀린 컬렉션 유형이기도 합니다.
    맵은 키-값 쌍(또는 항목)을 저장합니다. 키는 고유하지만 서로 다른 키를 동일한 값과 쌍으로 구성할 수 있습니다.
    Map 인터페이스는 키에 의한 값 액세스, 키 및 값 검색 등과 같은 특정 기능을 제공합니다.
     */
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)

    println("All keys: ${numbersMap.keys}")
    println("All values: ${numbersMap.values}")
    if ("key2" in numbersMap) println("Value by key \"key2\": ${numbersMap["key2"]}")
    if (1 in numbersMap.values) println("The value 1 is in the map")
    if (numbersMap.containsValue(1)) println("The value 1 is in the map") // same as previous

    println()

    // 동일한 쌍을 포함하는 Map 객체는 동일하다고 판단한다.
    val numbersMap2 = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
    val anotherMap2 = mapOf("key2" to 2, "key1" to 1, "key4" to 1, "key3" to 3)

    println("The maps are equal: ${numbersMap2 == anotherMap2}")

    // MutableMap<T> 는 쓰기작업이 가능한 Map 입니다.
    val numbersMap3 = mutableMapOf("one" to 1, "two" to 2)
    numbersMap3.put("three", 3)
    numbersMap3["one"] = 11

    println(numbersMap3)

    // LinkedHashMap은 요소 삽입 순서를 유지합니다.
}