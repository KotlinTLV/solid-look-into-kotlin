package il.co.kotlintlv.solid.isp.impl

import il.co.kotlintlv.solid.isp.api.InstrumentationTester

object QATester : InstrumentationTester {

    override fun instrumentationTest() = println("Run all instrumentation tests by Singleton QA")
}