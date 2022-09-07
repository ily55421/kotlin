package com.easy.kotlin.chapter0

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * @author lin 2022/9/7 22:57
 */
@RunWith(JUnit4::class)
class DefaultPackageDemoTest {
    @Test
    fun testDefaultPackage() {
        now()
        val car = Car()
        car.drive()
        // 顺序执行
        //Now Date is: Wed Sep 07 22:58:10 CST 2022
        //Drive The Car ...
    }
}