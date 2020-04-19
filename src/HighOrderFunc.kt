fun main() {
    var arr = arrayOf(1, 2, 3)
    arr.forEach {
        println(it * 2)
    }

    fun multiple(n: Int) {
        println(n * 2)
    }
    // ::fun
    arr.forEach(::multiple)

    // ラムダ式
    arr.forEach { n: Int -> println(n * 2) }
    // 引数が一つならit(iterator)で受け取れる
    arr.forEach { println(it * 2) }
    // ラベル構文でcontinueできる
    arr.forEach loop@{
        if (it == 2) return@loop // 2のときcontinueされる
        println(it)
    }

    arr.forEach {
        if (it == 1)
            if (it == 2) return@forEach // 2のときcontinueされる
        println(it)
    }

    // 関数の引数に関数も渡せる
    fun sayHelloLoop(name: String, count: Int, func: (name: String) -> Unit) {
        for (i in 1..count) {
            func(name)
        }
    }
    // ラムダ式が最後の引数だと引数の外に出せる
    sayHelloLoop("abreslav", 2) { name: String ->
        println("Hello ${name}")
    }
}
