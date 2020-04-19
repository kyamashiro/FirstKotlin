fun main() {
    // 範囲演算子
    val i = 10
    // 10 <= i <= 20
    println(i in 10..20)

    // ifは式なので値を返せる
    var fn = if (10 <= i) {
        "yes"
    } else {
        "no"
    }
    println(fn)

    // when式
    var whenCase = when (i) {
        100 -> "no"
        in 10..20 -> "yes"
        else -> "other"
    }
    println(whenCase)

    // is演算子
    val obj: Any = "abc"
    when (obj) {
        // lengthが使える　
        // 型チェックが行われるので暗黙の型変換(スマートキャスト)が行われる
        is String -> println("is String ${obj.length}")
        else -> println("not String")
    }

    // if式の代替
    var num = 10
    var caseif = when {
        num in 1..9 -> "aaa"
        num in 10..19 -> "bbb"
        else -> "ccc"
    }
    println(caseif)
}