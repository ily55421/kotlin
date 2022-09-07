package com.easy.kotlin.chapter0

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * @author lin 2022/9/7 22:52
 * 异步执行的测试代码
 */
@RunWith(JUnit4::class)
class PackageDemoTest {
    @Test
    fun testWhat() {
        what()
        //This is WHAT ?
    }
    @Test
    fun testDriveMotorbike(){
        val motorbike = Motorbike()
        motorbike.drive()
        //Drive The Motorbike ...
    }


    /**
     * 同一层级下自动入方法和类
     */
    @Test
    fun testDefaultPackage() {
        now()
        val car = Car()
        car.drive()
    }
}