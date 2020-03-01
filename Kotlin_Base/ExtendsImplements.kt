package test05_extends_implements

fun main(args: Array<String>) {
	var subtest = subClass()
	println(subtest.name)
	subtest.printSuper();

	var person1 = person("Kim", 27)
	println(person1.toString())
}

//기본적으로 상속이 불가능하며 상속을 위해서 open키워드를 추가해야 한다.0
open class superClass {
	var name: String = "Kim"
	//메소드도한 재정의 하기 위해서는 open 키워드를 사용
	open fun printSuper() {
		println("Super Class")
	}
}

//상속하려는 클래스를 : 를 사용하여 명시
class subClass : superClass() {
	var id: Int = 20
	override fun printSuper() {
		println("Sub class")
	}
}

abstract class abstractClass {
	fun noabsFun() {
		println("not abstract FunctionF")
	}

	abstract fun absFun()
}

//자식클래스는 추상 클래스가 아니므로 부모의 추상 메소드를 작성해 주어야 함
class absSubClass : abstractClass() {
	override fun absFun() {
		println("abstracClass")
	}
}

//인터페이스의 경우 따로 abstract키워드를 필요로 하지 않으며
interface interClass {
	fun printInter() {
		println("Im inter")
	}

	fun printSub()
}

//인터페이스 또한 추상 클래스와 같이 작성이 안된 함수들을 작성해야 한다.
class interSubclass : interClass {
	override fun printSub() {
		println("im sub inter")
	}
}

//data class는 toString, equals, hashCode등의 함수를 자동으로 추가하는 클래스이다,.
data class person(val name: String, val id: Int) {

}
