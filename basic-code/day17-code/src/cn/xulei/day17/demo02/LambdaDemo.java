package cn.xulei.day17.demo02;

public class LambdaDemo {
    public static void main(String[] args) {
        // lambda写法1
        new Thread(()-> System.out.println("多线程任务执行")).start();

        // 匿名内部类
        /*Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("多线程任务执行");
            }
        };
        new Thread(task).start();*/
    }
}
