package cn.xulei.day16.demo03;

public class Ticket implements Runnable{
    private int ticket = 100;

    Object lock = new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "正在卖" + ticket--);
                }
            }
        }
    }
}
