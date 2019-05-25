package cn.xulei.reflect;

import cn.xulei.domain.Person;

import java.lang.reflect.Constructor;

public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;

        //1.获取构造方法 Constructor<T> getConstructor(类<?>... parameterTypes)
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        //创建对象 (有参数)
        Object person = constructor.newInstance("张三", 23);
        System.out.println(person);

        System.out.println("-----------");

        //创建对象 (无参数)
        Object o = personClass.newInstance();
        System.out.println(o);


    }
}
