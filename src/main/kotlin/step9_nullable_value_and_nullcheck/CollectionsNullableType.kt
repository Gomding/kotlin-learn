package step9_nullable_value_and_nullcheck

class CollectionsNullableType {
}

/*
Collections of a nullable type
Null 형식의 요소 컬렉션이 있고 Null이 아닌 요소를 필터링하려면 filterNotNull을 사용하여 필터링할 수 있습니다.
 */

fun main() {
    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    val intList: List<Int> = nullableList.filterNotNull()

    println("> nullableList items")
    for (item in nullableList) {
        println(item)
    }

    println()

    println("> intList items")
    for (item in intList) {
        println(item)
    }
}