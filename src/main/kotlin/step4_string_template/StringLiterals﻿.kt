package step4_string_template

class StringLiterals {
}

fun main() {
    // '\' 백스페이스로 escaped string을 표현할 수 있다.
    // \t, \b, \n, \r, \', \", \\ and \$.
    val s = "Hello, world!\n"
    println("s = $s")

    // 원시 문자열은 """ 로 시작하고 끝내는 것으로 표현할 수 있다.
    // 원시 문자열은 이스케이프 문자열을 포함하지 않으며 줄 바꿈과 다른 문자열을 포함할 수 있다.
    val text = """
    for (c in "foo")
        print(c)
"""
    println("text = $text")

    // 원시 문자열의 문자열 공백 제거 tramMargin()
    val text2 = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()


}