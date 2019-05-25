package cn.xulei.day07.demo02;

public class MathTest {
    public static void main(String[] args) {
        double min = -10.8;
        double max = 5.9;

        int count = 0;

        for (double i = Math.ceil(min);i<=max;i++){
            if (Math.abs(i) > 6 || Math.abs(i) <2.1)
            {
                count++;
            }
        }
        System.out.println("个数为：" + count);
    }
}
