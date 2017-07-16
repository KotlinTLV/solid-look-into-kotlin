package il.co.kotlintlv.solid.interface_segregation_principle


fun main(args: Array<String>) {

    val goodDev = GoodJavaDeveloper()
    val pythonDev = GoodPythonDeveloper()

    println("A good java dev uses ${goodDev.type()} in ${goodDev.style()} style")
    println("A good java dev uses ${pythonDev.type()} in ${pythonDev.style()} style")

    goodDev.javaProject = 10
    goodDev.javaProject += 10

    println(goodDev.javaProject) // What will this print?
}

