package cn.xulei.day22.demo04;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ServerSocketDemo {
    public static void main(String[] args) throws IOException{
        ServerSocket server = new ServerSocket(8000);
        Socket socket = server.accept();

        //转换流,读取浏览器请求第一行
        BufferedReader readWb = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String requst = readWb.readLine();
        //取出请求资源的路径
        String[] strArr = requst.split(" ");
        //去掉web前面的/
        String path = strArr[1].substring(1);
        System.out.println(path);
        socket.close();
        server.close();
        readWb.close();

    }

}
