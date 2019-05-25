package cn.xulei.day22.demo03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class FileUpload_Server {
    public static void main(String[] args) throws IOException{
        System.out.println("服务器启动");

        ServerSocket server = new ServerSocket(6666);
        //每次接收新的链接，创建一个Socket
        while (true){
            Socket accept = server.accept();
            new Thread(()->{
                try {
                    //1.创建输入流读取文件对象
                    BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());

                    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(System.currentTimeMillis()+".png"));

                    byte[] bytes = new byte[1024];
                    int len;
                    while ((len = bis.read(bytes)) != -1) {
                        bos.write(bytes, 0, len);
                    }
                    bos.close();
                    bis.close();
                    accept.close();
                    System.out.println("文件已上传");
                }catch (IOException e)
                {
                    e.printStackTrace();
                }
            }).start();

        }
    }
}
