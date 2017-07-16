package il.co.kotlintlv.solid.interface_segregation_principle.impl

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class Project : ReadWriteProperty<Any, Int> {

    var lines: Int = 0

    override fun getValue(thisRef: Any, property: KProperty<*>): Int {
        return lines
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: Int) {
        //map.set(thisRef, map.get(thisRef)?.plus(value) ?: value)
        lines = lines + value
    }
}