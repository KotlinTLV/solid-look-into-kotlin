package il.co.kotlintlv.solid.basics.enums

private enum class AbstractMethodsPerson {
    ALEX {
        override fun sayName() = "Alex"
    },
    DOR {
        override fun sayName() = "Dor"
    },
    IGOR {
        override fun sayName() = "Igor"
    };

    abstract fun sayName(): String
}