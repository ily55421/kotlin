package com.easy.kotlin.variable

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * @author lin 2022/9/7 23:12
 */
@RunWith(JUnit4::class)
class VariableTypeInferenceKtTest {

    @Test
    fun testGetLength() {
        val obj = "abcdef"
        val len = getLength(obj)
        Assert.assertTrue(len == 6)
        //Kotlin 类层次结构的根(ROOT)。每个 Kotlin 类都有 [Any] 作为超类。
        val obj2:Any = Any()
       getLength(obj2)
        //class java.lang.String (Kotlin reflection is not available)
        //6
        //class java.lang.String (Kotlin reflection is not available)
        //class java.lang.Object (Kotlin reflection is not available)
    }
}