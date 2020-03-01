package test06_folwcontrol

fun main(args: Array<String>) {
	//kotlin에서는 if의 마지막식이 반환값이 된다.
	var a = 1;
	var b = 2;

	//삼항연산자와 비슷한 구조를 가진다.
	var result = if (a > b) {
		b
	} else {
		a
	}

	println(result)


	//자바의 switch대신 when을 사용한다. when또한 if와 같이 마지막 표현식이 반환값이 된다.
	println(
		when (a) {
			1 -> {
				1
			}
			2 -> {
				2
			}
			else -> {
				"error"
			}
		}
	)
}
