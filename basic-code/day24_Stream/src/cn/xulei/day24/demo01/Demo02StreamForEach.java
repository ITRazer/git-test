package cn.xulei.day24.demo01;

import java.util.stream.Stream;

public class Demo02StreamForEach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰","张无忌","周直落");
        stream.forEach(name -> System.out.println(name));
    }
}
