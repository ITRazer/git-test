package cn.xulei.day07.demo02;

import java.util.ArrayList;

public class Test02StudentArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // 创建学生对象
        String s1 = "曹操";
        String s2 = "刘备";
        String s3 = "诸葛亮";

        System.out.println(list);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        // 删除第一个元素
        list.remove(0);
        System.out.println(list.size());
    }
}
