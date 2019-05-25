package cn.xulei.day23.demo01;

import java.util.function.Consumer;

/**
 * java.util.function.Consumer<T> 接口则正好与Supplier接口相反，它不是生产一个数据，而是消费一个数据，
 其数据类型由泛型决定。
 */
public class Demo02Consumer {
    private static void consumerString(Consumer<String> function){
        function.accept("Hello");
    }

    public static void main(String[] args) {
        consumerString(s -> {
            System.out.println(s);
        });
    }
}
