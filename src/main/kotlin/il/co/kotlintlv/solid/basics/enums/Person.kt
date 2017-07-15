package il.co.kotlintlv.solid.basics.enums

fun main(args: Array<String>) {

    println(Person.ALEX.fullName())
    println(Person.DOR.fullName())
    println(Person.ALEX.fullName)
    println(Person.DOR.fullName)
}

private enum class Person(val firstName: String, val lastNane: String) {

    ALEX("Alex", "Gherschon"), DOR("Dor", "Samet");
    // full name as a function
    fun fullName() = "$firstName $lastNane"
    // full name as a property / characteristic
    val fullName : String
        get() = "$firstName $lastNane"
}
