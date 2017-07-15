package il.co.kotlintlv.solid.inheritence

class BobDylan : Bob("Bob") {
    override fun fullName(): String = "${sayName()} Dylan"
}