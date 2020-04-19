package Class

class Impl : MyInterface {
    override fun bar() {
        println("bar")
    }

    override fun foo(): Int {
        return super.foo() * 2
    }
}