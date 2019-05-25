package cn.xulei.day24.demo01;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.stream.Stream;

public class Demo03StreamFilter {
    public static void main(String[] args) {
        Stream<String> original = Stream.of("张三丰","张无忌","周直落");
        Stream<String> result = original.filter(s -> s.startsWith("张"));
    }
}
