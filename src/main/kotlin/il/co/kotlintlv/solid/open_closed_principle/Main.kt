package il.co.kotlintlv.solid.open_closed_principle

fun main(args: Array<String>) {
    val developerA = JavaDeveloper()
    val developerB = KotlinDeveloper()

    println(developerA.writeCode())
    println(developerB.writeCode())

    println(developerA is Developer)
    println(developerA is JavaDeveloper)

    println(developerB is Developer)
    println(developerB is KotlinDeveloper)
}
