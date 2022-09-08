package com.easy.kotlin.processControl

import org.junit.Test

import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * @author lin 2022/9/8 23:19
 */
@RunWith(JUnit4::class)
 class BreakAndContinueKtTest {

    @Test
    fun testBreakDemo_1(){
        breakDemo_1()
    }

    @Test
    fun testContinueDemo(){
        continueDemo()
        //1
        //3
        //5
        //7
        //9

    }
}