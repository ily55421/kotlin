package com.easy.kotlin.processControl

/**
 * @author lin 2022/9/8 23:43
 * 在 Kotlin 中 throw 是表达式，它的类型是特殊类型 Nothing。 该类型没有值。跟C、Java中的void 意思一样。
 * Nothing::class
 * class java.lang.Void
 */


fun fail(msg: String): Nothing {
    throw IllegalArgumentException(msg)
}

/**
 * 因为ex变量是Nothing类型，没有任何值，所以无法当做参数传给函数：
 * java.lang.ExceptionInInitializerError
Caused by: java.lang.Exception: YYYYYYYY
at com.easy.kotlin.processControl.ThrowExpressionKt.<clinit>(throwExpression.kt:15)
 */
val ex:Nothing = throw Exception("YYYYYYYY")


fun main(){
    fail("XXXX")
    //Exception in thread "main" java.lang.IllegalArgumentException: XXXX
    //	at com.easy.kotlin.processControl.ThrowExpressionKt.fail(throwExpression.kt:12)
    //	at com.easy.kotlin.processControl.ThrowExpressionKt.main(throwExpression.kt:16)
    //	at com.easy.kotlin.processControl.ThrowExpressionKt.main(throwExpression.kt)


    val exExpression = throw Exception("YYYYYYYY")


    //另外，因为ex变量是Nothing类型，没有任何值，所以无法当做参数传给函数：

    ex
}