package cn.xulei.day07.demo02;

import java.util.ArrayList;

public class Test02ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("宋远桥");
        list.add("张无忌");
        list.add("张三丰");
        list.add("殷梨亭");

        printArrayList(list);
    }
    public static void printArrayList (ArrayList<String> list)
    {
        // 拼接左括号
        System.out.print("{");
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (i != list.size() -1)
            {
                System.out.print(s + ",");
            }
            else
            {
                System.out.print( s + "}");
            }
        }
    }
}
