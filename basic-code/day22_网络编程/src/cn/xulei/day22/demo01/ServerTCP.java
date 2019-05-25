package cn.xulei.day22.demo01;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 */
public class ServerTCP {
    public static void main(String[] args) throws IOException{
        System.out.println("服务端启动等待连接...");

        //1,创建ServerScoket对象
        ServerSocket ss = new ServerSocket(6666);
        //2.接收连接
        Socket accept = ss.accept();
        //3.通过scoket获取输入流
        InputStream inputStream = accept.getInputStream();
        byte[] b = new byte[1024];
        int len = inputStream.read(b);
        String msg = new String(b,0,len);
        System.out.println(msg);
        //关闭资源
        inputStream.close();
        accept.close();
    }
}
