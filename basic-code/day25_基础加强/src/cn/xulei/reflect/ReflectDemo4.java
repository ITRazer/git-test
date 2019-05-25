package cn.xulei.reflect;

import cn.xulei.domain.Person;

import java.lang.reflect.Method;

public class ReflectDemo4 {
    public static void main(String[] args) throws Exception{
        Class personClass = Person.class;

        //1.获取指定方法
        //Method getMethod(String name, 类<?>... parameterTypes)
        Method eat_method = personClass.getMethod("eat");//空参
        Person p = new Person();
        //执行方法
        eat_method.invoke(p);

        Method eat_method2 = personClass.getMethod("eat", String.class);
        eat_method2.invoke(p,"饭");

        System.out.println("-----------");

        //1.获取所有public修饰的方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods)
        {
            System.out.println(method);
        }

        String Classname = personClass.getName();
        System.out.println(Classname);

    }
}
