package Class

fun main() {
    val h1: Human = Human("Dan", 10)
    val h2 = Human()
    h1.introduce()
    h2.setAge(20)
    h2.introduce()

    val impl = Impl()
    impl.bar()

    // データクラス
    val memberA = Member("mem1", 1)
    val memberB = Member("mem2", 2)
    val memberC = Member("mem1", 1)
    // データクラスでデフォルトで使用できるメソッド
    // equals
    // プライマリコンストラクタで定義されたプロパティが等しいか
    memberA.age = 10
    memberC.age = 12
    println(memberA.equals(memberC)) // ageは違うがプライマリコンストラクタの値が等しいのでtrue
    println(memberA.equals(memberB)) // false
    // toString()
    println(memberA.toString()) // プライマリコンストラクタで定義された値のみ出力される
    // componentN プライマリコンストラクタのN番目の値を取得できる
    println(memberA.component1())
    // 分解宣言
    val (name, type) = memberA
    println(name)
    // copy
    val memberACopy = memberA.copy()
    println(memberA.equals(memberACopy))
}