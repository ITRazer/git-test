package cn.xulei.day23.demo01;

import java.util.function.Predicate;

public class Demo05PredicateAnd {
    private static void method(Predicate<String> one,Predicate<String> two){
        boolean isValid = one.and(two).test("HelloWorld");
        System.out.println("字符串的长度符合要求吗:" + isValid);
    }

    public static void main(String[] args) {
        method(s -> s.contains("H"),s -> s.contains("W"));
    }
}
