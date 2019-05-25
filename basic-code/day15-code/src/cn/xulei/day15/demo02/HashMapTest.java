package cn.xulei.day15.demo02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Student,String> map = new HashMap<>();

        map.put(new Student("lisi",20),"上海");
        map.put(new Student("zhsngsan",30),"北京");
        map.put(new Student("wangwu",20),"南京");
        map.put(new Student("zhaoliu",20),"成都");
        map.put(new Student("xulei",20),"广东");

        // 根据键去找值
        Set<Student> keyset = map.keySet();
        for (Student key : keyset)
        {
            String value = map.get(key);
            System.out.println(key.toString() + "----" + value);
        }

        Set<Map.Entry<Student,String>> entrySet = map.entrySet();
        for (Map.Entry<Student,String> entry : entrySet)
        {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key.toString() + "......" + value);
        }
    }
}
