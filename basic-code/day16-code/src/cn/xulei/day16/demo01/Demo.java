package cn.xulei.day16.demo01;

public class Demo {
    public static void main(String[] args) {
        MyRunable mr = new MyRunable();
        // 创建线程对象
        Thread t = new Thread(mr,"小强");
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("旺财"+i);
        }
    }
}
