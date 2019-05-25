package cn.xulei.day15.demo03;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
class LinkedHashMapDemo
{
    public static void main(String[] args) {
        LinkedHashMap<String,String> map = new LinkedHashMap<>();

        map.put("胡歌","霍建华");
        map.put("郭德纲","于谦");
        map.put("薛之谦","大张伟");

        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        for (Map.Entry<String,String> entry : entrySet)
        {
            System.out.println(entry.getKey() + "-----" + entry.getValue());
        }
    }
}