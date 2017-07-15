package il.co.kotlintlv.solid.basics2

sealed class Person(val firstName: String,
                    val lastName: String) {

    fun fullName() = "$firstName $lastName"

    class Dor: Person("Dor", "Samet")
    class Alex(val age: Int) : Person("Alex", "Gherschon")
    /*data class Alex(val age: Int,
                    override val firstName:
                    String, override val lastName: String) : Person(lastName, firstName)*/
}

fun translatePerson(person: Person): String =
        when (person) {
            is Person.Dor -> person.fullName()
            is Person.Alex -> "${person.firstName} ${person.lastName}, of age ${person.age}"
        }

fun main(args: Array<String>) {

    println(translatePerson(Person.Dor()))
    println(translatePerson(Person.Alex(32)))
}

