package com.easy.kotlin.processControl

import java.lang.Integer.parseInt

/**
 * @author lin 2022/9/7 23:41
 * TODO when表达式
 * when表达式类似于 switch-case 表达式。when会对所有的分支进行检查直到有一个条件满足。但相比switch而言，when语句要更加的强大，灵活。
 */
fun main(){
    cases(2)
    println()
    //这不是String类型的数据

    cases(2L)
    println()
    //这是一个Long类型数据

    check()
    println()
    //x is in the range
}
fun cases(obj: Any) {
    when (obj) {
        1 -> print("第一项")
        "hello" -> print("这个是字符串hello")
        is Long -> print("这是一个Long类型数据")
        !is String -> print("这不是String类型的数据")
        else -> print("else类似于Java中的default")
    }
}

/**
 * TODO 像 if 一样，when 的每一个分支也可以是一个代码块，它的值是块中最后的表达式的值。
如果其他分支都不满足条件会到 else 分支（类似default）。
 */
fun switch(x: Any) {
    when (x) {
        -1, 0 -> print("x == -1 or x == 0")
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> { // 注意这个块
            print("x is neither 1 nor 2")
        }
    }
}

/**
 * todo 可以用任意表达式（而不只是常量）作为分支条件
 */
fun switch(x: Int) {
    val s = "123"
    when (x) {
        -1, 0 -> print("x == -1 or x == 0")
        1 -> print("x == 1")
        2 -> print("x == 2")
        8 -> print("x is 8")
        parseInt(s) -> println("x is 123")
        else -> { // 注意这个块
            print("x is neither 1 nor 2")
        }
    }
}

/**
 * todo 可以检测一个值在 in 或者不在 !in 一个区间或者集合中
 */
fun check(){
    val x = 1
    val validNumbers = arrayOf(1, 2, 3)
    when (x) {
        in 1..10 -> print("x is in the range")
        in validNumbers -> print("x is valid")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }
}