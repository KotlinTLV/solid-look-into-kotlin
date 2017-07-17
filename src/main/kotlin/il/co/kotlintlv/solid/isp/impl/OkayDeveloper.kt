package il.co.kotlintlv.solid.isp.impl

import il.co.kotlintlv.solid.isp.api.Developer
import il.co.kotlintlv.solid.isp.api.InstrumentationTester
import il.co.kotlintlv.solid.isp.api.UnitTester

class OkayDeveloper: Developer, UnitTester, InstrumentationTester by QATester {
    override fun code() = println("Write some code")
    override fun unitTest() = println("Unit test this code")
}
