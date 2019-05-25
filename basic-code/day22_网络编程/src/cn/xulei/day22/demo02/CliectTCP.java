package cn.xulei.day22.demo02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class CliectTCP {
    public static void main(String[] args) throws IOException{
        System.out.println("客户端发送数据");

        Socket client = new Socket("localhost",6666);

        OutputStream os = client.getOutputStream();
        os.write("你还好吗".getBytes());
        //==============解析回写==============
        InputStream in = client.getInputStream();
        byte[] bytes = new byte[1024];
        int len = in.read(bytes);
        System.out.println(new String(bytes,0,len));
        in.close();
        os.close();
        client.close();
    }
}
