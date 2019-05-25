package cn.xulei.day18.demo02;

import java.io.File;

public class DiGuiDemo {
    public static void main(String[] args) {
        File dir = new File("D:/aaa");
        dir.mkdir();
        print(dir);
    }

    public static void print(File dir)
    {
        File[] files = dir.listFiles();
        for (File file : files)
        {
            if (file.isFile())
            {
                // 是文件，判断文件名并输出文件绝对路径
                if (file.getName().endsWith(".java"));
                {
                    System.out.println("文件名:" + file.getAbsolutePath());
                }
            }else {
                // 是目录继续遍历
                print(dir);
            }
        }
    }
}
