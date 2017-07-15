package il.co.kotlintlv.solid.open_closed_principle

open class JavaDeveloper(otherLanguage: String) : Developer(otherLanguage) {
    open val version = "9"
    constructor(): this("Java") //Secondary Constructor
    override fun writeCode(): String = writeJavaCode()
    protected open fun writeJavaCode() = "public static void main(String[] args)"
}
