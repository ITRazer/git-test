package cn.xulei.day22.demo03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class FileUpload_Client {
    public static void main(String[] args) throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:/1.png"));
        Socket cliect = new Socket("localhost",6666);
        BufferedOutputStream bos = new BufferedOutputStream(cliect.getOutputStream());

        byte[] b = new byte[1024];
        int len;
        while((len = bis.read(b)) != -1){
            bos.write(b,0,len);
            bos.flush();
        }
        System.out.println("文件发送完毕");
        bos.close();
        cliect.close();
        bis.close();
        System.out.println("文件上传完毕");
    }
}
