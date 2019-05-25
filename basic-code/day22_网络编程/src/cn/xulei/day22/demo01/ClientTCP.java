package cn.xulei.day22.demo01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTCP {
    public static void main(String[] args) throws IOException{
        System.out.println("客户端发送数据");

        Socket client = new Socket("localhost",6666);
        OutputStream outputStream = client.getOutputStream();

        outputStream.write("我来了".getBytes());
        outputStream.close();
        client.close();
    }
}
