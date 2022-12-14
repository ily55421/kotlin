package com.easy.kotlin.chapter0;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lin 2022/9/7 22:33
 */
public class Stream<A, B, C> {
    public static void main(String[] args) {
        G<String, Integer> g = (s) -> s.length();
        F<Integer, Boolean> f = (x) -> x % 2 != 0;
        FG<String, Integer, Boolean> fg = (x) -> f.apply(g.apply(x));
        List<String> strings = new ArrayList();
        strings.add("a");
        strings.add("ab");
        strings.add("abc");
        List<String> result = new ArrayList();
        for (String s : strings) {
            if (fg.apply(s)) {
                result.add(s);
            }
        }
        System.out.println("java实现："+result);
    }
}

interface G<A, B> {
    B apply(A a);
}
interface F<B, C> {
    C apply(B b);
}
interface FG<A, B, C> {
    C apply(A a);
}