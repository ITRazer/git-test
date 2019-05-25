package cn.xulei.day09.demo01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        QunZhu qz = new QunZhu("群主",200);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入金额");
        double money = sc.nextDouble();
        System.out.println("请输入个数");
        int count = sc.nextInt();

        //发送红包
        ArrayList<Double> sendList = qz.send(money,count);

        if (sendList == null)
        {
            System.out.println("余额不足");
            return;
        }


        Member m1 = new Member("张三",2);
        Member m2 = new Member("李四",3);
        Member m3 = new Member("王五",4);

        m1.openHongbao(sendList);
        m2.openHongbao(sendList);
        m3.openHongbao(sendList);

        qz.show();
        m1.show();
        m2.show();
        m3.show();

    }
}
