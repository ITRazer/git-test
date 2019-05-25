package cn.xulei.day23.demo01;

import java.util.function.Consumer;

public class Demo03ConsumerAndThen {
    private static void consumerString(Consumer<String> one,Consumer<String> two,Consumer<String> three){
        one.andThen(three).accept("Hello");//先执行大写，在执行转换成字节
        one.andThen(two).accept("String");//先执行大写，在执行小写
    }

    public static void main(String[] args) {
        consumerString(
                s -> System.out.println(s.toUpperCase()),
                s -> System.out.println(s.toLowerCase()),
                s -> System.out.println(s.getBytes())
        );
    }
}
