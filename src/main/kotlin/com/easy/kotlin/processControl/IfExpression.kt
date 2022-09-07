package com.easy.kotlin.processControl

/**
 * @author lin 2022/9/7 23:37
 * TODO  if表达式
 * if-else语句是控制程序流程的最基本的形式，其中else是可选的。

在 Kotlin 中，if 是一个表达式，即它会返回一个值(跟Scala一样)。
 todo  if后的括号不能省略，括号里表达式的值须是布尔型
 */
fun main(args: Array<String>) {
    println(max(1, 2))
    // 2

    println(max3(1, 2))
    // Max is b2

}
fun max(a: Int, b: Int): Int {
// 作为表达式
    val max = if (a > b) a else b
    return max //  return if (a > b) a else b
}
fun max1(a: Int, b: Int): Int {
    // 传统用法
    var max1 = a
    if (a < b) max1 = b
    return max1
}
fun max2(a: Int, b: Int): Int {
// With else
    var max2: Int
    if (a > b) {
        max2 = a
    } else {
        max2 = b
    }
    return max2
}

/**
 * if 的分支可以是代码块，最后的表达式作为该块的值：
 */
fun max3(a: Int, b: Int): Int {
    val max = if (a > b) {
        print("Max is a")
        a
    } else {
        print("Max is b")
        b
    }
    return max
}
fun three(): Int {
    // 另外，在Kotlin中没有类似true? 1: 0这样的三元表达式。对应的写法是使用if else语句:

    if(true) return 1 else return 0
}