package test01_variable


fun main(args: Array<String>) {
	/*
	 * 가변 변수는 var 불변 변수는 val로 선언한다.
 	 * 따라서 val로 선언할 경우 해당 변수의 값을 할당해야 한다.
	 * var 를 명시하지 않을경우 자동으로 캐스팅 되긴하지만 되도록 선언하도록 한다.
	 */

	var name = "Hello world"
	var name2 = "Hello world2"
	println(name)
	println(name2)

	/*
 	 * null의 경우 기존의 java와 달리 컴파일 단계에서 체크하며 ? 키워드를 통해 구분한다.
 	 * null-able 의 경우 non-null 보다 가질수 있는 값이 크기 때문에 non-null을 할당 가능하나 반대는 불가능 하다.
	 */
	var nullable: String? = null
	var nonnull: String = "non-null"
	println(nullable)
	println(nonnull)

	//null-able 과 non-null의 경우 호출에 있어 다음과 같은 차이를 보인다.
	println(nullable?.length)
	println(nonnull.length)

	/*
 	 * 엘비스 연산자를 통해 좌항의 값에 따라 null 일경우 우항의 값을 반환하며  null 이 아닐경우 좌항의 값을 반환한다.
 	 * 이때 좌/우항의 값은 변수, 표현식, 함수 모두 가능하다.
 	 */
	println(nullable ?: "null이 아닙니다.")
	println(nonnull ?: "null이 아닙니다.")


}