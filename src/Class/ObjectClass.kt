package Class

object ObjectClass {
    val name: String = "singleton"

    fun getInstance(): ObjectClass {
        return this
    }
}