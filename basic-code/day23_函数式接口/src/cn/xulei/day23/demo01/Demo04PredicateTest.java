package cn.xulei.day23.demo01;

import java.util.function.Predicate;

public class Demo04PredicateTest {
    public static void method(Predicate<String> predicate){
        boolean veryLong = predicate.test("HelloWord");
        System.out.println("字符串长吗" + veryLong);
    }

    public static void main(String[] args) {
        method(s -> s.length() > 5);
    }
}
