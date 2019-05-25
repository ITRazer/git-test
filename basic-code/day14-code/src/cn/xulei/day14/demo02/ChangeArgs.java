package cn.xulei.day14.demo02;

public class ChangeArgs {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int sum = getsum(arr);
        System.out.println(sum);

        // 可变参写法
        int sum2= getsum(1,2,3,4,5);
        System.out.println(sum2);
    }

    /*public static int  getsum(int [] arr)
    {
       int sum = 0;
       for (int a : arr) {
           sum += a;
       }
       return  sum;
    }*/

    public static int getsum(int...arr)
    {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return  sum;
    }
}
