package cn.xulei.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理模式
 */
public class ProxyTest {
    public static void main(String[] args) {
        //1.创建真实对象
        Lenovo lenovo = new Lenovo();
        //动态代理增强lenovo对象
        /*
            三个参数
                1.类加载器  真实对象.getClass().getClassLoader()
                2.接口数组  真实对象.getClass().getInterfaces()
                3.处理器   new InvocationHandler()
         */
        SaleComputer proxy_lenovo = (SaleComputer) Proxy.newProxyInstance(lenovo.getClass().getClassLoader(), lenovo.getClass().getInterfaces(), new InvocationHandler() {
            /*
                代理逻辑编写的方法，代理对象调用的所有方法都会触发该方法执行
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
               /* System.out.println("执行了");
                System.out.println(method.getName());//sale
                System.out.println(args[0]);//10000
                */

               //判断是否是sale方法
                if (method.getName().equals("sale")) {
                    //1.增强参数
                    double money = (double) args[0];
                    money = money * 0.85;
                    //使用真实对象调用该方法
                    String invoke = (String) method.invoke(lenovo, money);
                    //2.增强返回值类型
                    return invoke + "_鼠标垫";
                }else {
                    Object invoke = method.invoke(lenovo, args);
                    return invoke;
                }
            }
        });
        //2.调用方法
        String computer = proxy_lenovo.sale(10000);
        System.out.println(computer);
    }
}
