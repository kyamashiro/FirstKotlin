class Coordinate(val x: Double, val y: Double) {
    operator fun plus(c: Coordinate): Coordinate {
        return Coordinate(this.x + c.x, this.y + c.y)
    }
}

fun main() {
    // 演算子のオーバーロード
    val c1 = Coordinate(1.0, 2.0)
    val c2 = Coordinate(3.0, 4.0)
    val c3 = c1 + c2
    println(c3.x)
    println(c3.y)
}