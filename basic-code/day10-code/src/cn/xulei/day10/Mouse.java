package cn.xulei.day10;

public class Mouse implements USB {
    public void open()
    {
        System.out.println("鼠标开启");
    }
    public void close()
    {
        System.out.println("鼠标关闭");
    }
    public void click()
    {
        System.out.println("鼠标单击");
    }
}
