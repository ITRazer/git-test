package cn.xulei.day13.demo02;

import java.util.ArrayList;
import java.util.Collections;

/*
    模拟发牌
 */
public class Poker {
    public static void main(String[] args) {
        //1.1创建牌盒
        ArrayList<String> pokerBox = new ArrayList<>();

        //1.2创建花色集合
        ArrayList<String> colors = new ArrayList<>();

        //1.3创建数字集合
        ArrayList<String> numbers = new ArrayList<>();

        colors.add("❤");
        colors.add("♦");
        colors.add("♣");
        colors.add("♠");

        for (int i = 2;i<=10;i++)
        {
            numbers.add(i+"");
        }
        numbers.add("J");
        numbers.add("K");
        numbers.add("K");
        numbers.add("A");

        //1.4创造牌 一个花色一个数字，存储到牌盒中
        for (String color:colors)
        {
            for (String number:numbers)
            {
                String card = color + number;
                pokerBox.add(card);
            }
        }

        //1.5大王小王
        pokerBox.add("小🃏");
        pokerBox.add("大🃏");

        //洗牌
        //shuffle 使用随机源对指定列表进行置换
        Collections.shuffle(pokerBox);

        //发牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        //
        for (int i = 0; i < pokerBox.size(); i++) {
            String card = pokerBox.get(i);
            if (i>=51)
            {
                dipai.add(card);
            }else
            {
                if (i%3==0)
                {
                    player1.add(card);
                }
                else if (i%3==1)
                {
                    player2.add(card);
                }
                else
                {
                    player3.add(card);
                }
            }
        }
        System.out.println("张飞" + player1);
        System.out.println("李白" + player2);
        System.out.println("关羽" + player3);
        System.out.println("底牌" + dipai);
    }
}
