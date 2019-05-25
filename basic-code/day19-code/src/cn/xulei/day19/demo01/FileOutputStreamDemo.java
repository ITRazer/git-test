package cn.xulei.day19.demo01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo{
    public static void main(String[] args) throws IOException{
        File file = new File("fos.txt");
        //以追加方式创建流
        FileOutputStream fos = new FileOutputStream(file,true);
        fos.write(97);
        fos.write(98);
        fos.write(99);

        byte[] b = "天猫超市".getBytes();
        fos.write(b);
        fos.write("\r\n".getBytes());
        byte[] words = {97,98,99,100,101};
        for (int i = 0; i < words.length; i++) {
            fos.write(words[i]);
            fos.write("\r\n".getBytes());
        }


        fos.close();
    }
}
