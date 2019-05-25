package cn.xulei.day10;

public class keyBoard implements USB{
    public void open()
    {
        System.out.println("键盘开启");
    }
    public void close()
    {
        System.out.println("键盘关闭");
    }
    public void type()
    {
        System.out.println("键盘打字");
    }
}
