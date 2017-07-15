package il.co.kotlintlv.solid.open_closed_principle

class KotlinDeveloper: JavaDeveloper("Kotlin") {
    override val version: String = "1.1"
    override fun writeJavaCode(): String = writeKotlinCode()
    private fun writeKotlinCode(): String = "fun main(args: Array<String>)"
}
