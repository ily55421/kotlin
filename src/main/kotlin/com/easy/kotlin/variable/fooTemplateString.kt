package com.easy.kotlin.variable

/**
 * @author lin 2022/9/7 23:34
 * TODO 字符串与其模板表达式
 * 原始字符串(raw string)由三重引号（”””）分隔(这个跟python一样)。原始字符串可以包含换行符和任何其他字符。
 */
fun main(args: Array<String>) {
    val rawString = """
fun helloWorld(val name : String) {
   println("Hello, world!")
}
"""
    println(rawString)

    val fooTemplateString = "$rawString has ${rawString.length} characters"
    println(fooTemplateString)
    // 模板表达式引用
    //fun helloWorld(val name : String) {
    //   println("Hello, world!")
    //}
    //
    //
    //fun helloWorld(val name : String) {
    //   println("Hello, world!")
    //}
    // has 67 characters
}