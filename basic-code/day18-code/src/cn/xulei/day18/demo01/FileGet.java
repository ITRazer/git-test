package cn.xulei.day18.demo01;

import java.io.File;
import java.io.IOError;
import java.io.IOException;

public class FileGet {
    public static void main(String[] args) throws IOException {
        File f = new File("d:/aaa/bbb.java");
        System.out.println("文件绝对路径:" + f.getAbsolutePath());
        System.out.println("文件构造路径:" + f.getPath());
        System.out.println("文件名称:"+f.getName());
        System.out.println("文件长度:"+f.length()+"字节");

        //文件的创建
       /* File f2 = new File("aaa.txt");
        System.out.println("是否存在:" + f2.exists());//false
        System.out.println("是否创建:" + f2.createNewFile());//true
        System.out.println("是否存在:" + f2.exists());//true*/

        //目录的创建
        /*File f3 = new File("newDir");
        System.out.println("是否存在:" + f3.exists());//false
        System.out.println("是否创建:" + f3.mkdir());//true
        System.out.println("是否存在:" + f3.exists());//true*/

        //目录的遍历
        File dir = new File("d:/java_code");
        dir.mkdir();
        String[] names = dir.list();
        for (String name :
                names) {
            System.out.println(name);//1.txt 2.zip
        }
        
        //文件的遍历
        File[] files = dir.listFiles();
        for (File file :
                files) {
            System.out.println(file);//d:\java_code\1.txt  d:\java_code\2.zip
        }
    }

}
