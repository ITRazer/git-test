package cn.xulei.day07.demo02;

public class String_Demo {
    public static void main(String[] args) {
        String s = "abcde";

        // 字符串转换成字符数组
        char [] chs = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            System.out.println(chs[i]);
        }

        System.out.println("----------------");

        // 字符串转换成字节数组
        byte[] bytes = s.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
    }
}
