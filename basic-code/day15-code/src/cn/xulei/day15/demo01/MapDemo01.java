package cn.xulei.day15.demo01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*Map集合遍历键找值方式*/
public class MapDemo01 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("胡歌","霍建华");
        map.put("郭德纲","于谦");
        map.put("薛之谦","大张伟");

        Set<String> keys = map.keySet();
        for (String key :
                keys) {
            String value = map.get(key);
            System.out.println(key + "----" + value);
        }

        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        for (Map.Entry<String,String> entry:entrySet)
        {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "----" + value);
        }
    }


}
