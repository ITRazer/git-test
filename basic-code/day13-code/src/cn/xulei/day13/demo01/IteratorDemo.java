package cn.xulei.day13.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();

        coll.add("张飞");
        coll.add("关羽");
        coll.add("刘备");

       /* Iterator<String> it = coll.iterator();
        while(it.hasNext())
        {
            String s = it.next();
            System.out.println(s);
        }*/

       for (String s : coll)
       {
           System.out.println(s);
       }
    }
}
