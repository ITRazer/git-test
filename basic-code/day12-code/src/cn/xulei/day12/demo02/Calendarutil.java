package cn.xulei.day12.demo02;

import java.util.Calendar;

public class Calendarutil {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);

        System.out.println(year + "年" + month + "月" + day + "日");
    }
}
