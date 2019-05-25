package cn.xulei.day15.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串:");
        String line = new Scanner(System.in).nextLine();
        findChar(line);
    }

    private static void findChar(String line) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < line.length(); i++) {
            //每次获取一个字符
            char c = line.charAt(i);
            if (map.containsKey(c)) {
                Integer count = map.get(c);
                map.put(c, ++count);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }
}
