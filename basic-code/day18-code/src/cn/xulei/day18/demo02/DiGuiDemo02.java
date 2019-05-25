package cn.xulei.day18.demo02;

import java.io.File;
import java.io.FileFilter;

public class DiGuiDemo02 {
    public static void main(String[] args) {
        File dir = new File("D:/aaa");
        dir.mkdir();
        //printDir2(dir);
        printDir3(dir);
    }
    public static void printDir2(File dir)
    {
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java")||pathname.isDirectory();
            }
        });
        for (File file : files)
        {
            if (file.isFile()){
                System.out.println("文件名:" + file.getAbsolutePath());
            }else{
                printDir2(file);
            }
        }
    }

    //lambda优化
    public static void printDir3(File dir)
    {
        File[] files = dir.listFiles(f -> {
            return f.getName().endsWith(".java") || f.isDirectory();
        });
        for (File file : files) {
            if (file.isFile()) {
                System.out.println("文件名:" + file.getAbsolutePath());
            } else {
                printDir3(file);
            }
        }
    }
}
