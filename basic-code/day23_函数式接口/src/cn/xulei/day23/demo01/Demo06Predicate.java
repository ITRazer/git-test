package cn.xulei.day23.demo01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * 1. 必须为女生；
   2. 姓名为4个字。
 */
public class Demo06Predicate {
    public static void main(String[] args) {
        String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女" };
        List<String> list = filter(array,
                s -> "女".equals(s.split(",")[1]),
                s -> s.split(",")[0].length() == 4);
        System.out.println(list);
    }

    private static List<String> filter(String[] array, Predicate<String> one,Predicate<String> two){
        List<String> list = new ArrayList<>();
        for (String info : array)
        {
            if (one.and(two).test(info)){
                list.add(info);
            }
        }
        return list;
    }
}
