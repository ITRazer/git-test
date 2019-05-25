package cn.xulei.day10;

class Labtop {
    // 笔记本开启
    public void run()
    {
        System.out.println("笔记本运行");
    }
    public void useUSB(USB usb)
    {
        // 判断是否有usb设备，这时当笔记本对象调用这个功能时，必须给其传递一个符合USB规则的USB设备
        if (usb != null)
        {
            usb.open();
            // 类型转换，调用特有方法
            if (usb instanceof Mouse)
            {
                Mouse m = (Mouse)usb;
                m.click();
            }else  if (usb instanceof keyBoard)
            {
                keyBoard kb= (keyBoard)usb;
                kb.type();
            }
            usb.close();
        }
    }
    public void shutDown()
    {
        System.out.println("笔记本关闭");
    }
}
