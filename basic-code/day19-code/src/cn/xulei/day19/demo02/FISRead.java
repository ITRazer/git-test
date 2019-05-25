package cn.xulei.day19.demo02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FISRead {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:/1.PNG");

        FileOutputStream fos = new FileOutputStream("test_copy.jpg");

        int len;
        byte [] bytes = new byte[1024];
        while((len = fis.read(bytes)) != -1)
        {
            fos.write(bytes,0,len);
        }

        fos.close();
        fis.close();
    }
}
