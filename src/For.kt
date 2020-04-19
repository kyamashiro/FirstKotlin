fun main() {
    val map = mapOf<String, Int>("First" to 1, "Second" to 2, "Third" to 3)
    for ((key, value) in map) {
        println("key:${key} value:${value}")
    }

    val list = listOf("a", "b", "c")
    for ((i, v) in list.withIndex()) {
        println("index:${i} value:${v}")
    }

    // until演算子
    // 1 <= i < 3
    for (i in 1 until 3) {
        println(i) // 1,2
    }
    // 範囲演算子
    for (i in 1..3) {
        println(i) // 1,2,3
    }
    // 3から減らしていく
    for (i in 3 downTo 1) {
        println(i)
    }
    // step
    for (i in 1..6 step 2) {
        println(i) // 1,3,5 2ずつ増える
    }

    // ラベル構文
    outer@ for (i in 1..3) {
        for (j in 1..3) {
            println("i:${i} j:${j}")
            if (i == 2) {
                // 外側のループを終了させる
                break@outer
            }
        }
    }
}