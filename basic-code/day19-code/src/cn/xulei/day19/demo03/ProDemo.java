package cn.xulei.day19.demo03;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ProDemo {
    public static void main(String[] args) {
        Properties properties = new Properties();

        properties.setProperty("filename","a.txt");
        properties.setProperty("length","12312414");
        properties.setProperty("location","D:\\a.txt");
       Set<String> strings = properties.stringPropertyNames();
        for (String key :
                strings) {
            System.out.println(key + "---"+properties.getProperty(key));
        }

        Properties pro = new Properties();
        //加载文本中信息到属性集
        try {
            pro.load(new FileReader("fos.txt"));
            Set<String> strings1 = pro.stringPropertyNames();
            for (String key1 :
                    strings1) {
                System.out.println(key1 + "---"+pro.getProperty(key1));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
