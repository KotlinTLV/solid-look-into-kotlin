package il.co.kotlintlv.solid.open_closed_principle

open class Developer(val language: String) {
    open fun writeCode() = "I Write code in $language"
}