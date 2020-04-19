package Class

// valでreadonlyになる
class Human(private val name: String = "名無しさん", private var age: Int = 0) {
    fun introduce() {
        println("My name is $name.")
        println("$age years old.")
    }

    fun setAge(age: Int) {
        this.age = age
    }
}