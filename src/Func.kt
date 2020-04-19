fun main() {
    // voidではなくUnit Unitは省略可能
    // ローカル関数
    fun hello(name: String): Unit {
        println("Hello, ${name}")
    }
    hello("Kotlin")

    // 単一式関数
    fun multi(num: Int): Int = num * 2
    println(multi(5))

    // 可変長引数 vararg
    // 配列とみなされる ここではたぶんarray<Int>とみなされる
    fun allSum(vararg values: Int): Int {
        return values.sum()
    }
    println(allSum(1, 2, 3))

    // スプレッド演算子
    val arr = intArrayOf(1, 5, 10)
    // 型がIntの引数にIntの配列を渡すことができる
    println(allSum(*arr))
    println(allSum(100, *arr, 3))

    // 複数の戻り値を返せる Tripleもある
    fun returnPair(): Pair<String, Int> {
        return Pair("Pair", 1)
    }

    val (_, pair) = returnPair()
    println("pair:${pair}")
}

