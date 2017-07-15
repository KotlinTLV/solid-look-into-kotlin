package il.co.kotlintlv.solid.interface_segregation_principle.api


interface EmptySpaces {

    enum class Type {
        TABS, SPACES
    }

    fun type(): Type
}