package com.easy.kotlin.processControl

/**
 * @author lin 2022/9/7 23:51
 * TODO while循环
while 和 do .. while使用方式跟C、Java语言基本一致。
 */
fun main(args: Array<String>) {
    var x = 10
    while (x > 0) {
        x--
        println(x)
    }
    var y = 10
    //DO 会多执行一次
    do {
        y = y + 1
        println(y)
    } while (y < 20) // y的作用域包含此处
}