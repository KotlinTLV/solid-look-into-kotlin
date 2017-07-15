package il.co.kotlintlv.solid.interface_segregation_principle.impl

import il.co.kotlintlv.solid.interface_segregation_principle.model.Language
import il.co.kotlintlv.solid.interface_segregation_principle.api.CodeStyle

class LanguageCodeStyle(val language: Language) : CodeStyle {

    override fun style() = when (language) {
        Language.JAVA, Language.KOTLIN -> CodeStyle.Style.CAMEL_CASE
        Language.PYTHON -> CodeStyle.Style.SNAKE_CASE
    }
}