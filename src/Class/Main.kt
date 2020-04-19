package Class

fun main() {
    val h1: Human = Human("Dan", 10)
    val h2 = Human()
    h1.introduce()
    h2.setAge(20)
    h2.introduce()

    val impl = Impl()
    impl.bar()
}