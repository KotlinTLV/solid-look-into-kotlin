package il.co.kotlintlv.solid.inheritence

class BobDole(override val firstName: String = "Bob",
              val lastName: String = "Dole") : Bob(firstName) {
    override fun fullName(): String = "I'm Bob Dole"
}