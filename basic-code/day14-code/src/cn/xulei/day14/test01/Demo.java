package cn.xulei.day14.test01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("jack",12));
        list.add(new Student("rose",18));
        list.add(new Student("abc",20));
        list.add(new Student("ace",30));
        list.add(new Student("mark",44));

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge() - o1.getAge();//降序
            }
        });

        for (Student s:
             list) {
            System.out.println(s);
        }
    }
}
