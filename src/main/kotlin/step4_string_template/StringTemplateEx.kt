package step4_string_template

class StringTemplateEx {
}

// 문자열 리터럴은 템플릿 표현식을 포함할 수 있다.
// 달러 기호($)로 시작하며 아래와 같이 사용할 수 있습니다.
fun main() {

    var a = 1
    // 템플릿 안에 간단한 이름으로 사용이 가능
    val s1 = "a is $a"

    a = 2
    // 템플릿 임의 표현식
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println("s2 = $s2")

    var b = "abc"
    println("$b.length is ${b.length}")

    //원시 문자열과 이탈 문자열(escaped string)모두 문자열 템플릿을 사용할 수 있습니다.
    val text = """
        $b
    """.trimIndent()
    println("text = $text")

    // $ 문자를 표현하고 싶다면 아래와 같이 표현할 수 있습니다.
    val price = """
${'$'}_9.99
"""
    println("price = $price")
}