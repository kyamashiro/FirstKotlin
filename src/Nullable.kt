import java.net.InetAddress

fun main() {
    // null許容の場合?をつける
    var a: String? = "Hello"
    val b: String? = a
    println(if (a == b) "yes" else "no")

    a = null
    println(a)
    println(b)

    var p = Point(1)
    var q = p
    q.a = 2
    println(p.a)
    println(q.a)

    // ?. セーフコール演算子
    println(b?.length) // Helloの長さ5
    println(a?.length) // null nullの値にアクセスした場合でもエラーにならない
    // ?: nullだった場合に返すデフォルトに返す値を指定できる
    println(a?.length ?: "nullだよ")
    // Nullable型の非null型への変換
    println(b!!.length) // 5
    println(a!!.length) // Exception in thread "main" kotlin.KotlinNullPointerException
}