package com.easy.kotlin.processControl

/**
 * @author lin 2022/9/7 23:46
 *  todo for循环
Kotlin的for循环跟现代的程序设计语言基本相同。
 */
/**
 * iterator遍历
 */
fun main(args: Array<String>) {
    for (arg in args)
        println(arg)
    // or
    println()

    //TODO indices 索引  通过索引遍历一个数组或者一个 list
    for (i in args.indices)
        println(args[i])

    //222
    //
    //222

    //TODO 用库函数 withIndex
    for ((index, value) in args.withIndex()) {
        println("the element at $index is $value")
    }
    //the element at 0 is 222
}
fun forIterator(){
    val collection = arrayOf(1,2,3)
    for (item in collection) {
        print(item)
    }
}
fun forIterator2(){
    val collection = arrayOf(1,2,3)
    for (item in collection) {
        print(item)
    }
}
