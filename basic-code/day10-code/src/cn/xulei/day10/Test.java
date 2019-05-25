package cn.xulei.day10;

public class Test {
    public static void main(String[] args) {
        Labtop lt = new Labtop();

        lt.run();

        // 创建鼠标实体
        USB u = new Mouse();
        lt.useUSB(u);

        keyBoard kb = new keyBoard();
        lt.useUSB(kb);

        lt.shutDown();
    }
}
//    笔记本运行
//    鼠标开启
//    鼠标单击
//    鼠标关闭
//    键盘开启
//    键盘打字
//    键盘关闭
//    笔记本关闭
