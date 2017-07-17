package il.co.kotlintlv.solid.isp.main

import il.co.kotlintlv.solid.isp.impl.OkayDeveloper

fun main(args: Array<String>) {

    val dev = OkayDeveloper()
    dev.code()
    dev.unitTest()
    dev.instrumentationTest()
}