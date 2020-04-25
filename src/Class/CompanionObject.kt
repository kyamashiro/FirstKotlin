package Class

class CompanionObject {
    companion object {
        fun staticMethod(): CompanionObject = CompanionObject()
    }
}