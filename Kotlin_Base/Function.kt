package test02_function

fun main(args: Array<String>) {
	add(1, 2)
	FunctionBase().add(2, 3)
	println(FunctionBase().add2(2, 3))

	//확장함수
	var say = "Hello world"
	println(say)
	println(say.addDoubleQuotes())
	println(FunctionBase().add3(1, 2, 3))
}

//fun키워드를 통해 함수를 선언하며 인자와 반환형을 가진다
fun add(a: Int, b: Int) {
	println(a + b)
}

//기본적인 형태의 함수
class FunctionBase {
	//반환형의 유무
	fun add(a: Int, b: Int) {
		println(a + b)
	}

	fun add2(a: Int, b: Int): Int {
		return a + b
	}
}

//확장 함수
//대상 클래스에 함수를 추가하여 사용하는 방식
fun String.addDoubleQuotes(): String {
	return "\"$this\""
}

//사용자 지정 클래스에도 가능
fun FunctionBase.add3(a: Int, b: Int, c: Int): Int {
	return a + b + c
}
