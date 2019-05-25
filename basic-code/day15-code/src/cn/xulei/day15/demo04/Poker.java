package cn.xulei.day15.demo04;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Poker {
    public static void main(String[] args) {

        //创建牌盒
        HashMap<Integer,String> pokermap = new HashMap<>();

        // 创建花色集合
        ArrayList<String> colors = new ArrayList<>();
        //创建数字集合
        ArrayList<String> numbers = new ArrayList<>();

        Collections.addAll(colors,"♦","♣","♠","💗");
        Collections.addAll(numbers,"2","A","J","Q","K","3","4","5","6","7","8","9","10");

        //设置存储编号
        int count = 1;
        pokermap.put(count++,"大王");
        pokermap.put(count++,"小王");

        // 把所有的牌放入牌盒中
        for (String number : numbers)
        {
            for (String color : colors)
            {
                String card = color + number;
                pokermap.put(count++,card);
            }
        }

        //将54张牌打乱
        Set<Integer> numberSet = pokermap.keySet();
        ArrayList<Integer> numberlist = new ArrayList<>();
        numberlist.addAll(numberSet);
        Collections.shuffle(numberlist);

        ArrayList<Integer> noP1 = new ArrayList<>();
        ArrayList<Integer> noP2 = new ArrayList<>();
        ArrayList<Integer> noP3 = new ArrayList<>();
        ArrayList<Integer> dipaiNo = new ArrayList<>();

        for (int i=0;i<numberlist.size();i++)
        {
            //获取该编号
            Integer no =numberlist.get(i);
            if (i>=51)
            {
                dipaiNo.add(no);
            }else
            {
                if (i%3==0)
                {
                    noP1.add(no);
                }else if (i%3==1)
                {
                    noP2.add(no);
                }else
                {
                    noP3.add(no);
                }
            }
        }

        Collections.sort(noP1);
        Collections.sort(noP2);
        Collections.sort(noP3);
        Collections.sort(dipaiNo);

        //创建三个玩家牌面集合 以及底牌牌面集合
        ArrayList<String>player1 = new ArrayList<>();
        ArrayList<String>player2 = new ArrayList<>();
        ArrayList<String>player3 = new ArrayList<>();
        ArrayList<String>dipai = new ArrayList<>();

        for (Integer i : noP1)
        {
            String card = pokermap.get(i);
            player1.add(card);
        }
        for (Integer i : noP2)
        {
            String card = pokermap.get(i);
            player2.add(card);
        }
        for (Integer i : noP3)
        {
            String card = pokermap.get(i);
            player3.add(card);
        }
        for (Integer i : dipaiNo)
        {
            String card = pokermap.get(i);
            dipai.add(card);
        }
        System.out.println("令狐冲："+player1);
        System.out.println("石破天："+player2);
        System.out.println("鸠摩智："+player3);
        System.out.println("底牌："+dipai);
    }
}
