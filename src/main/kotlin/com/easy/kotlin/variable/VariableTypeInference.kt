package com.easy.kotlin.variable

import java.util.*

/**
 * @author lin 2022/9/7 23:09
 * TODO 变量类型推断
 * 在Kotlin中大部分情况你不需要说明你使用对象的类型，编译器可以直接推断出它的类型。
 */
fun typeInference(){
    val str = "abc"
    println(str)
    println(str is String)
    println(str::class)
    println(str::class.java)
    // abc
    // true
    // class java.lang.String (Kotlin reflection is not available)
    // class java.lang.String
    val d = Date()
    println(d)
    println(d is Date)
    println(d::class)
    println(d::class.java)
    // Fri Jun 09 00:06:33 CST 2017
    // true
    // class java.util.Date (Kotlin reflection is not available)
    // class java.util.Date
    val bool = true
    println(bool)
    println(bool::class)
    println(bool::class.java)
    // true
    // boolean (Kotlin reflection is not available)
    // boolean
    val array = arrayOf(1,2,3)
    println(array)
    println(array is Array)
    println(array::class)
    println(array::class.java)
    // [Ljava.lang.Integer;@7b5eadd8
    // true
    // class [Ljava.lang.Integer; (Kotlin reflection is not available)
    // class [Ljava.lang.Integer;
}
fun Int2Long(){
    //整型变量Int不能赋值Long变量。下面的代码不能通过编译
    val x:Int = 10
//    val y:Long = x // Type mismatch
}

/**
 *     显式地调用对应的类型转换函数进行转换
 */
fun Int2Long2(){
    val x:Int = 10
    //  val y:Long = x // Type mismatch
    val y: Long = x.toLong()
}

/**
 * 使用is运算符进行类型检测  (泛型擦除)
 */
fun getLength(obj: Any): Int? {
    var result = 0
    if (obj is String) {
        // `obj` 在该条件分支内自动转换成 `String`
        println(obj::class) //class java.lang.String
        result = obj.length
        println(result)
    }
    // 在离开类型检测分支后，`obj` 仍然是 `Any` 类型
    println(obj::class) // class java.lang.Object
    return result
}
