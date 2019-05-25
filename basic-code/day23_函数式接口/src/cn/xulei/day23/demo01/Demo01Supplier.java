package cn.xulei.day23.demo01;

import java.util.function.Supplier;

/**
 * java.util.function.Supplier<T> 接口仅包含一个无参的方法： T get() 。用来获取一个泛型参数指定类型的对
 象数据。由于这是一个函数式接口，这也就意味着对应的Lambda表达式需要“对外提供”一个符合泛型类型的对象
 数据。
 */
public class Demo01Supplier {
    public static int getMax(Supplier<Integer> sup)
    {
        return sup.get();
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,22};

        int maxSum = getMax(()->{
            int max = arr[0];
            for (int i:arr){
                if (i>max){
                    max = i;
                }
            }
            return max;
        });
        System.out.println(maxSum);
    }
}
