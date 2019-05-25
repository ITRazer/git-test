package cn.xulei.day20.demo02;

import java.io.*;
import java.util.HashMap;

public class BufferedTest {
    public static void main(String[] args) {
        HashMap<String,String> lineMap = new HashMap<>();

        try
                ( BufferedReader br = new BufferedReader(new FileReader("D:\\in.txt"));
                  BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));
                ) {
            String line = null;
            while((line = br.readLine()) != null){
                //解析文本
                String[] split = line.split("\\.");
                lineMap.put(split[0],split[1]);
            }
            br.close();
            for (int i = 1; i <=lineMap.size(); i++) {
                String key = String.valueOf(i);
                String value = lineMap.get(key);
                bw.write(key +"."+ value);
                //换行
                bw.newLine();
            }
            bw.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
