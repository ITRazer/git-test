package cn.xulei.day16.demo03;

public class Demo02 implements  Runnable{
        private int ticket = 100;
        @Override
        public void run() {
            while(true)
            {
                sellTicket();
            }
        }

        public synchronized void sellTicket()
        {
            if (ticket > 0)
            {
                try{
                    Thread.sleep(100);
                }catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                String name = Thread.currentThread().getName();
                System.out.println("正在卖:" + ticket--);
            }
        }

    public static void main(String[] args) {
        new Demo02().run();
    }
}
