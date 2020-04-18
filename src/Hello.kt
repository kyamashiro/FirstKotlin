fun main(args: Array<String>) {
    // コンパイル kotlinc Hello.kt -include-runtime -d app.jar
    // 実行 kotlin app.jar Hello
    // 実行結果 args: Hello
    println("args: ${args[0]}")
    val hello: String = "Hello World!"
    println(hello)
}