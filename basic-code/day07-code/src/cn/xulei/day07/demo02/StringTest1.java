package cn.xulei.day07.demo02;

public class StringTest1 {
    public static void main(String[] args) {
        int [] arr = {1,2,3};

        String s = arrayToString(arr);

        System.out.println("s:" + s);
    }

    public static String arrayToString(int [] arr)
    {
        // 创建字符串
        String s = new String("[");

        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1)
            {
                s = s.concat(arr[i] + "#");
            }
            else
            {
                s = s.concat(arr[i] + "]");
            }
        }
        return  s;
    }
}
