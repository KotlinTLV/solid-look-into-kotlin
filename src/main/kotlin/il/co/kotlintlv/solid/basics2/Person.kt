package il.co.kotlintlv.solid.basics2

sealed class Person(val firstName: String,
                    val lastName: String) {

    fun fullName() = "$firstName $lastName"

    class Dor: Person("Dor", "Samet")
    class Alex(val age: Int, fName: String, lastName: String) : Person(fName, lastName)
    /*data class Alex(val age: Int,
                    override val firstName:
                    String, override val lastName: String) : Person(lastName, firstName)*/
}
