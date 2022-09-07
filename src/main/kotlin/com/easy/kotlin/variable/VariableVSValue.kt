package com.easy.kotlin.variable

/**
 * @author lin 2022/9/7 23:04
 * todo 声明变量和值
 * Kotlin的变量分为 var (可变的) 和 val (不可变的)。
 * var 是可写的，在它生命周期中可以被多次赋值；
而 val 是只读的，仅能一次赋值，后面就不能被重新赋值。
 */
class VariableVSValue {

    fun declareVar() {
        var a = 1
        a = 2
        println(a)
        println(a::class)
        println(a::class.java)
        var x = 5 // 自动推断出 `Int` 类型
        x += 1
        println("x = $x")
    }
    fun declareVal() {
        val b = "a"
        //b  = "b" //编译器会报错： Val cannot be reassigned
        println(b)
        println(b::class)
        println(b::class.java)
        val c: Int = 1  // 立即赋值
        val d = 2   // 自动推断出 `Int` 类型
        val e: Int  // 如果没有初始值类型不能省略
        e = 3       // 明确赋值
        println("c = $c, d = $d, e = $e")
    }
}
fun main(){
     VariableVSValue().declareVar()
     VariableVSValue().declareVal()
    //2
    //int (Kotlin reflection is not available)
    //int
    //x = 6
    //a
    //class java.lang.String (Kotlin reflection is not available)
    //class java.lang.String
    //c = 1, d = 2, e = 3
}