package cn.xulei.day23.demo01;

import java.util.function.Function;

/**
 * 1. 将字符串截取数字年龄部分，得到字符串；
 2. 将上一步的字符串转换成为int类型的数字；
 3. 将上一步的int数字累加100，得到结果int数字。
 */
public class DemoFunction {
    public static void main(String[] args) {
        String str= "徐磊,20";
        int age = getAgeNum(str,
                s -> s.split(",")[1],
                s -> Integer.parseInt(s),
                n -> n += 100);
        System.out.println(age);
    }

    private static int getAgeNum(String str, Function<String,String> one,Function<String,Integer> two,Function<Integer,Integer> three){
        return one.andThen(two).andThen(three).apply(str);
    }
}
