package il.co.kotlintlv.solid.interface_segregation_principle.api


interface CodeStyle {

    enum class Style {
        CAMEL_CASE, SNAKE_CASE
    }

    fun style() : Style
}