package Class

interface MyInterface {
    private val property: Int
        get() = 10

    fun foo(): Int {
        return this.property
    }

    fun bar()
}