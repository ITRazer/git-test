package cn.xulei.day20.demo01;

import java.io.*;

public class BufferedDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        try
                (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\node-v6.10.2-x64.msi"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.msi"));
                ){
            int len;
            byte[] bytes = new byte[1024];
            while((len=bis.read(bytes)) != -1)
            {
                bos.write(bytes,0,len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("缓冲流复制时间:" + (end - start) +"毫秒");
    }
}
