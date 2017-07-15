package il.co.kotlintlv.solid.interface_segregation_principle.impl

import il.co.kotlintlv.solid.interface_segregation_principle.api.EmptySpaces

class GoodGuys : EmptySpaces {
    override fun type() = EmptySpaces.Type.SPACES
}