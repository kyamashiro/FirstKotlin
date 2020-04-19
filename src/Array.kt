fun main() {
    // array
    val a = arrayOf(1, 2, 3)
    val b = intArrayOf(1, 2, 3)
    val c: Array<String> = arrayOf("val1", "val2")
    println(c[1])

    // コレクション
    val list = listOf<String>("list1", "list2")
    println(list) // [list1, list2]
    val set = setOf<String>("A", "B", "C")
    println(set) // [A, B, C]
    var map = mapOf<String, Int>("First" to 1, "Second" to 2)
    println(map) // {First=1, Second=2}
}