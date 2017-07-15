package il.co.kotlintlv.solid.inheritence

abstract class Bob(open val firstName: String) : Person {
    // abstract override fun fullName(): String
    fun sayName(): String = "My Name Is $firstName"
}