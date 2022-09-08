package com.easy.kotlin.processControl


/**
 * @author lin 2022/9/8 23:47
 */

// 这是一个行注释
/* 这是一个多行的
   块注释。 */


/**
 * hhhh
 * /**
 *  fff
 *  /**
 *    ggggg
 *  */
 * */
 *
 * abc
 *
 */
fun main(args:Array<String>){
    val f = Functions()
    println(f.fvoid1())
    println(f.fvoid2())
    println(f.sum1(1,1))
    println(f.sum2(1,1))
}
class Functions{
    fun fvoid1(){}
    fun fvoid2(){}

    fun sum1(a:Int,b:Int):Int{
        return a+b
    }
    fun sum2(a:Int,b:Int):Int{
        return a+b
    }
}