package com.easy.kotlin.processControl

/**
 * @author lin 2022/9/8 23:22
 * 在Java、C语言中，return语句使我们再常见不过的了。虽然在Scala，Groovy这样的语言中，
 * 函数的返回值可以不需要显示用return来指定，但是我们仍然认为，使用return的编码风格更加容易阅读理解。
在Kotlin中，除了表达式的值，有返回值的函数都要求显式使用return来返回其值。
 */
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun returnMax(a: Int, b: Int): Int {
    if (a > b) return a else return b
}

/**
 * returnDemo_1 在遇到 3 时会直接返回(有点类似循环体中的break行为)。最后输出
 */
fun returnDemo_1() {
    println(" START " + ::returnDemo_1.name)
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    intArray.forEach {
        if (it == 3) return
        println(it)
    }
    //START returnDemo_1
    //1
    //2
}

/**
 * returnDemo_2 遇到 3 时会跳过它继续执行(有点类似循环体中的continue行为)。最后输出
 *
 * 在returnDemo_2 中，我们用一个匿名函数替代 lambda 表达式。 匿名函数内部的 return 语句将从该匿名函数自身返回。
 * TODO 通过一个闭包解决调用问题
 */
fun returnDemo_2() {
    println(" START " + ::returnDemo_2.name)
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    intArray.forEach(fun(a: Int) {
        if (a == 3) return
        println(a)
    })
    println(" END " + ::returnDemo_2.name)
    //START returnDemo_2
    //1
    //2
    //4
    //5
    // END returnDemo_2
}


    /**
 * 我们在Kotlin中，可以直接使用=符号来直接返回一个函数的值。
 */
fun sum2(a: Int,b: Int) = a + b
fun max4(a: Int, b: Int) = if (a > b) a else b

val sum3=fun(a:Int, b:Int) = a+b

/**
 * 后面的函数体语句有没有大括号 {} 意思完全不同。加了大括号，意义就完全不一样了。
 * sumf，maxf的返回值是函数类型：  () -> kotlin.Int
 *
 *然后，调用方式是直接调用invoke()函数。通过REPL的编译错误提示信息，我们也可以看出，在Kotlin中，调用无参函数也是要加上括号()的
 * kotlin 中 return 语句会从最近的函数或匿名函数中返回，但是在Lambda表达式中遇到return，则直接返回最近的外层函数。
 */
val sumf = fun(a:Int, b:Int) = {a+b}

fun maxf(a:Int, b:Int) = {if(a>b) a else b}

fun main(){
    println(sum2(2,3)
    )

   println( max4(1,4 ))
    //5
    //4

    //(kotlin.Int, kotlin.Int) -> kotlin.Int
    println(sum3(1,4))
    //(kotlin.Int, kotlin.Int) -> () -> kotlin.Int
    println(sumf(1,1)) //Function0<java.lang.Integer>  返回的是函数类型
    //() -> kotlin.Int
    println(sumf(1,1).invoke())

    println( maxf(1,2)) //Function0<java.lang.Integer>
    println( maxf(1,2).invoke())

    returnDemo_1()
    returnDemo_2()
}