package cn.xulei.day22.demo02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 */
public class ServerTCP {
    public static void main(String[] args) throws IOException{
        System.out.println("服务器端启动,等待连接");
        ServerSocket ss = new ServerSocket(6666);
        Socket server = ss.accept();
        InputStream is = server.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        String msg = new String(bytes,0,len);
        System.out.println(msg);
        //=============回写数据==============
        OutputStream out = server.getOutputStream();
        out.write("我很好，谢谢你".getBytes());
        out.close();
       is.close();
       server.close();

    }
}
