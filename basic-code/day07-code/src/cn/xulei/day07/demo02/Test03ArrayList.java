package cn.xulei.day07.demo02;

import java.util.ArrayList;
import java.util.Random;

public class Test03ArrayList {
    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int r = random.nextInt(10) + 1;
            list.add(r);
        }

        //调用偶数集合
        ArrayList<Integer> arraylist = getArrayList(list);
        System.out.println(arraylist);
    }

    public static ArrayList<Integer> getArrayList(ArrayList<Integer> list)
    {
        // 创建小集合，保存偶数
        ArrayList<Integer> smallList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
           Integer number = list.get(i);
           if (number %2 == 0)
           {
               smallList.add(number);
           }
        }
        return smallList;
    }
}
