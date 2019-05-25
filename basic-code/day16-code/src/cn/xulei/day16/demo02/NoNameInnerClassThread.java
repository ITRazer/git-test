package cn.xulei.day16.demo02;

public class NoNameInnerClassThread {
    public static void main(String[] args) {
       /* new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("刘烨"+i);
                }
            }
        }.run();*/

       Runnable r = new Runnable() {
           @Override
           public void run() {
               for (int i = 0; i < 20; i++) {
                   System.out.println("许卿"+i);
               }
           }
       };
       new Thread(r).start();
    }
}
