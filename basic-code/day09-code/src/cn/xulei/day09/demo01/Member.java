package cn.xulei.day09.demo01;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(String username, double leftMoney) {
        super(username, leftMoney);
    }

    // 打开红包，就是从集合中，随机取出一份，保存到自己的余额中
    public void openHongbao(ArrayList<Double> list)
    {
        Random r = new Random();

        // 随机生成一个数组索引
        int index = r.nextInt(list.size());

        // 移除一个金额
        Double money = list.remove(index);

        // 加上自己的余额
        setLeftMoney(money + this.getLeftMoney());
    }
}
