package cn.xulei.day09.demo01;

import java.util.ArrayList;

public class QunZhu extends User {
    public QunZhu() {
    }

    public QunZhu(String username, double leftMoney)
    {
        super(username,leftMoney);
    }

    public ArrayList<Double> send(double money,int count)
    {
        // 获取群主余额
        double leftMoney = getLeftMoney();

        if (money > leftMoney)
        {
            return null;
        }

        // 修改群主余额
        setLeftMoney(leftMoney - money);

        // 创建一个集合，保存等份金额
        ArrayList<Double> list = new ArrayList<>();

        //扩大一百倍
        money = money * 100;

        // 每份的金额
        double m = money/count;

        //不能整除的余数
        double l = money % count;

        //无论是否整除，n-1份，都是每份的等额金额
        for (int i = 0; i < count - 1; i++) {
            list.add(m/100.0);
        }

        //判断是否整除
        if (l == 0)
        {
            list.add(m /100.0);
        }
        else
        {
            list.add((m+1)/100.0);
        }
        return list;
    }
}
