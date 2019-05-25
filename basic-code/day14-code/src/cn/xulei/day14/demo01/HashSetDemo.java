package cn.xulei.day14.demo01;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Student> stuSet = new HashSet<>();

        stuSet.add(new Student("张飞",12));
        stuSet.add(new Student("李白",22));
        stuSet.add(new Student("刘备",32));
        stuSet.add(new Student("张飞",12));

        for (Student stu2 : stuSet)
        {
            System.out.println(stu2);
        }
    }
}
