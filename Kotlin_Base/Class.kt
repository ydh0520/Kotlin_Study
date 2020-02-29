package test03_class

//클래스 선언
//기본적으로 자바와 비슷한 형태이나 생성자를 클래스명 뒤에 이어 붙인다. constructor 키워드는 생략 가능하다.
class Person constructor(param: String) {
	var id: Int = 0;
	var name: String = "Kim"

	//클래스의 프로퍼티로 static을 사용할수 없으므로 companion object를 사용한다.
	companion object {
		var count = 1
	}
}

//클래스 생성자
//생성자(contstructor)에서 초기화를 진행하며 
class Car constructor(val carPrice: Int = 100, val carColor: String = "RED") {
	fun getColor(): String {
		return carColor
	}
}

class Student {
	//getter setter의 경우 field키워드를 통해 접근한다.
	//기존의 자바처럼 함수형태로 작성하지않고 프로퍼티 아래에 선언한다.

	var name: String = "Kim"
		get() = field
		set(value: String) {
			field = value
		}
}

fun main(args: Array<String>) {
	//변수의 선언에 new를 사용하지 않는다.
	//클래스의 프로퍼티의 접근은 .를 통해 접근
	var person1 = Person("first")
	person1.name = "Yun"
	println(person1.id)
	println(person1.name)

	println(Person.count)

	//paramer에 따라 자동으로 초기화 되며 자바의 생성자 오버로딩과 비슷한
	//기본 생성자
	var car1 = Car()
	//인자를 전달하여 초기화
	var car2 = Car(100, "BLUE")

	//매개변수 혼동을 방지하기 위하여 명시적으로 처리 가능하다.
	//	var car3 = Car("GREEN")<-에러 발생 순서와 타입이 엄격하다
	var car3 = Car(carColor = "GREEN")

	println(car1.getColor())
	println(car2.getColor())
	println(car3.getColor())

	//getter setter는 자바처럼 함수로 쓰지 않는다.
	var st1 = Student()
	st1.name = "LEE"
	println(st1.name)
	
}
