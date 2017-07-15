package il.co.kotlintlv.solid.basics.interfaces

private interface Person {
    val age: Int
    fun fullName(): String
}

fun main(args: Array<String>) {
    var person: Person? = null
}