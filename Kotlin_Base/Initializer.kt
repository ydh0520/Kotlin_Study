package test04_initializer


fun main(args: Array<String>) {
	//init 실행 후 constructor를 실행한다.
	var car1 = Car()

	//let 초기화
	var name: String? = null
	name?.let {
		//let 내부에서는 it을 통해 접근 가능
		println(it)
	}
	name = "KIM"
	name?.let {
		println(it)
	}

	var lateinit = Name()
	lateinit.initName()//초기화 안하면 에러 발생
	println(lateinit.name)

	var address = Address()
	val location by lazy {address.loadAddress()}//location을 사용할때 초기화 진행
	println("loadAddress")
	location
	println("call location")
}

class Car(var carPrice: Int, var carColor: String) {
	constructor() : this(0, "") {
		println("constructor")
	}

	init {
		carPrice = 1000
		carColor = "BLUE"
		println("init")
	}
}

class Name {
	lateinit var name: String//lateinit이 없으면 에러 발생->non null이라 초기화를 해줘야함

	fun initName() {
		name = "Kim"
	}
}

class Address {
	fun loadAddress(): String {
		println("Loding 1000 sec")
		return "Korea"
	}
}

