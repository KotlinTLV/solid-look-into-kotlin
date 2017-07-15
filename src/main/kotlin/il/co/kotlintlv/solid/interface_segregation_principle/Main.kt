package il.co.kotlintlv.solid.interface_segregation_principle


fun main(args: Array<String>) {

    val goodDev = GoodJavaDeveloper()
    val lessGoodDev = LessGoodJavaDeveloper()

    println("A good dev uses ${goodDev.type()}")
    println("A less good dev uses ${lessGoodDev.type()}")
}
