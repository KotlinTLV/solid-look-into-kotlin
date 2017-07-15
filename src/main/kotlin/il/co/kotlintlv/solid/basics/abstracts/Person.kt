package il.co.kotlintlv.solid.basics.abstracts

fun main(args: Array<String>) {

    val person: Person? = null
    person!!.fullName() // NPE
}

abstract class Person(val firstName: String,
                      val lastName: String) {
    abstract fun fullName(): String

}
