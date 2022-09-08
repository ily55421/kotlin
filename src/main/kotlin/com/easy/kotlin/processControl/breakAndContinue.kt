package com.easy.kotlin.processControl

/**
 * @author lin 2022/9/8 23:18
 */
/**
 * 我们在写代码的时候，经常会遇到在某种条件出现的时候，就直接提前终止循环。
 * 而不是等到循环条件为false时才终止。这个时候，我们就可以使用break结束循环。
 * break用于完全结束一个循环，直接跳出循环体，然后执行循环后面的语句。
 */
fun breakDemo_1() {
    for (i in 1..10) {
        println(i)

        if (i % 2 == 0) {
            break
        }
    } // break to here
}

/**
 * continue是只终止本轮循环，但是还会继续下一轮循环。可以简单理解为，直接在当前语句处中断，跳转到循环入口，执行下一轮循环。而break则是完全终止循环，跳转到循环出口。
 */
fun continueDemo() {
    for (i in 1..10) {
        if (i % 2 == 0) {
            continue
        }
        println(i)
    }
}
