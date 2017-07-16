package il.co.kotlintlv.solid.interface_segregation_principle

import il.co.kotlintlv.solid.interface_segregation_principle.api.CodeStyle
import il.co.kotlintlv.solid.interface_segregation_principle.api.EmptySpaces
import il.co.kotlintlv.solid.interface_segregation_principle.impl.LessGoodGuys
import il.co.kotlintlv.solid.interface_segregation_principle.impl.LanguageCodeStyle
import il.co.kotlintlv.solid.interface_segregation_principle.impl.Project
import il.co.kotlintlv.solid.interface_segregation_principle.model.Language

class LessGoodJavaDeveloper(val name: String) : CodeStyle by LanguageCodeStyle(Language.JAVA) {

    val kotlinWebSite: Int by Project()
}

