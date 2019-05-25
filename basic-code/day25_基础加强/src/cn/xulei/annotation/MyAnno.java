package cn.xulei.annotation;

public @interface MyAnno {

    /**
     * 属性列表
     * @return
     */

    //基本数据类型
    int age();
    //String
    String name() default "张三";
    //枚举
    Person per();
    //注解
    MyAnno2 anno2();
    //数组
    String[] strs();
}
