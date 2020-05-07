package cn.shenzhencj.kotlinlibrary

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun test1() {
        // for
        val items = listOf("apple","banana", "android")
        for (item in items){
            println("item=${item}")
        }

        //while
        var index = 0
        while (index < items.size){
            println("index={$index}")
            index++
        }

        //when
    }


}
