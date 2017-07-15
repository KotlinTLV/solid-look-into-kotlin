package il.co.kotlintlv.solid.interface_segregation_principle.impl

import il.co.kotlintlv.solid.interface_segregation_principle.api.EmptySpaces

class LessGoodGuys : EmptySpaces {
    override fun type() = EmptySpaces.Type.TABS
}