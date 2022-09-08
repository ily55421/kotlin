package com.easy.kotlin.processControl

/**
 * @author lin 2022/9/8 23:34
 * TODO 标签控制循环结束    java也有类似的语句
 *在 Kotlin 中任何表达式都可以用标签（label）来标记。 标签的格式为标识符后跟 @ 符号，例如：abc@、jarOfLove@ 都是有效的标签。我们可以用Label标签来控制 return、break 或 continue的跳转（jump）行为。

Kotlin 的函数是可以被嵌套的。它有函数字面量、局部函数等。 有了标签限制的 return，我们就可以从外层函数返回了。例如，从 lambda 表达式中返回，returnDemo_2() 我们可以显示指定lambda 表达式中的return地址是其入口处。
 */

/**
 * TODO java 标签示例
 testlbl:
for (int i = 0; i <= max; i++) {
int length = substring.length();
int j = i;
int k = 0;
while (length-- != 0) {
if(strSearch.charAt(j++) != substring.charAt(k++)){
continue testlbl;
}
}
found = true;
break testlbl;
}
 */

/**
 * 我们在 lambda 表达式开头处添加了标签here@ ，我们可以这么理解：该标签相当于是记录了Lambda表达式的指令执行入口地址， 然后在表达式内部我们使用return@here 来跳转至Lambda表达式该地址处。
 */
fun returnDemo_3() {
    println(" START " + ::returnDemo_3.name)
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    intArray.forEach here@ {
        if (it == 3) return@here // 指令跳转到 lambda 表达式标签 here@ 处。继续下一个it=4的遍历循环
        println(it)
    }
    println(" END " + ::returnDemo_3.name)
    // START returnDemo_3
    //1
    //2
    //4
    //5
    // END returnDemo_3
}

/**
 * 也可以使用隐式标签更方便。 该标签与接收该 lambda 的函数同名。
 * 接收该Lambda表达式的函数是forEach, 所以我们可以直接使用 return@forEach ，来跳转到此处执行下一轮循环。
 */
fun returnDemo_4() {
    println(" START " + ::returnDemo_4.name)
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    intArray.forEach {
        if (it == 3) return@forEach // 从 lambda 表达式 @forEach 中返回。
        println(it)
    }
    println(" END " + ::returnDemo_4.name)
}

fun breakDemo_2() {
    println("---------------  breakDemo_1 ---------------")
    for (outer in 1..5) {
        println("outer=" + outer)
        for (inner in 1..10) {
            println("inner=" + inner)
            if (inner % 2 == 0) {
                break
            }
        }
    }
    //---------------  breakDemo_1 ---------------
    //outer=1
    //inner=1
    //inner=2
    //outer=2
    //inner=1
    //inner=2
    //outer=3
    //inner=1
    //inner=2
    //outer=4
    //inner=1
    //inner=2
    //outer=5
    //inner=1
    //inner=2
}

/**
 * 当我们想直接跳转到外层for循环，这个时候我们就可以使用标签了。
 */
fun breakDemo_3() {
    println("---------------  breakDemo_2 ---------------")
    outer@ for (outer in 1..5)
        for (inner in 1..10) {
            println("inner=" + inner)
            println("outer=" + outer)
            if (inner % 2 == 0) {
                break@outer
            }
        }
    //---------------  breakDemo_2 ---------------
    //inner=1
    //outer=1
    //inner=2
    //outer=1
}

/**
 * 为了代码可读性，我们可以用标签来显式地指出循环体的跳转地址，比如说在breakDemo_1()中，我们可以用标签来指明内层循环的跳转地址：
 */
fun breakDemo_4() {
    println("---------------  breakDemo_3 ---------------")
    for (outer in 1..5)
        inner@ for (inner in 1..10) {
            println("inner=" + inner)
            println("outer=" + outer)
            if (inner % 2 == 0) {
                break@inner
            }
        }
    //---------------  breakDemo_3 ---------------
    //inner=1
    //outer=1
    //inner=2
    //outer=1
    //inner=1
    //outer=2
    //inner=2
    //outer=2
    //inner=1
    //outer=3
    //inner=2
    //outer=3
    //inner=1
    //outer=4
    //inner=2
    //outer=4
    //inner=1
    //outer=5
    //inner=2
    //outer=5
}

fun main(){
    returnDemo_3()
    returnDemo_4()
    breakDemo_2()
    breakDemo_3()
    breakDemo_4()
}