package cn.xulei.day07.demo01;

import java.util.Random;

public class ScannerDemo {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入:");
//        int i = sc.nextInt();
//        System.out.println(i);

        Random r = new Random();
        // 1- 100的随机数
        int i = r.nextInt(100) + 1;
        System.out.println(i);
    }

}
