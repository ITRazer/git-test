package cn.xulei.reflect;

import cn.xulei.domain.Person;

import java.lang.reflect.Field;

public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;

        //1.获取成员变量 所有被public修饰的成员变量
        Field[] fields = personClass.getFields();
        for (Field field :
             fields) {
            System.out.println(field);
        }
        System.out.println("---------");
        //2.Field getField(String name)
        Field a = personClass.getField("a");
        //获取成员变量的值
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);// null
        //设置a值
        a.set(p,"张三");
        System.out.println(p);// Person{name='null', age=0, a='张三', b='null', c='null'}

        System.out.println("===========");

        //3.Field[] getDeclaredFields() 获取所有的成员
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField:
             declaredFields) {
            System.out.println(declaredField);
        }

        //4.Field getDeclaredField(String name)
        Field d = personClass.getDeclaredField("name");
        //忽略访问权限修饰符
        d.setAccessible(true);//暴力反射
        Object value2 = d.get(p);
        System.out.println(value2);
    }
}
