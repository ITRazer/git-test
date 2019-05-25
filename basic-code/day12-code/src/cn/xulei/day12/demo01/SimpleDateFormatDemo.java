package cn.xulei.day12.demo01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String str = df.format(date);
        System.out.println(str);
       try {
           function();
       }catch (Exception e)
       {
           e.printStackTrace();
       }
    }

    public static void function() throws Exception
    {
        System.out.println("请输入出生日期 格式YYYY-MM-dd");
        String birthdayString = new Scanner(System.in).next();
        //将字符串日期，转成Date对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthdayString);
        Date todayDate = new Date();
        long birthdaySecond = birthdayDate.getTime();
        long todaySecond = todayDate.getTime();
        long secone = todaySecond-birthdaySecond;
        if (secone < 0)
        {
            System.out.println("还没出生呢");
        }else{
            System.out.println(secone/1000/60/60/24);
        }

    }
}
