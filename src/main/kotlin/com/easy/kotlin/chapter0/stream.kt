package com.easy.kotlin

/**
 * @author lin 2022/9/7 22:31
 */
fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C {
    return { x -> f(g(x)) }
}
// 数字规则
fun isOdd(x: Int) = x % 2 != 0
// 获取长度
fun length(s: String) = s.length
fun main(args: Array<String>) {
    val oddLength = compose(::isOdd, ::length)
    val strings = listOf("a", "ab", "abc")
    println(strings.filter(oddLength))
}