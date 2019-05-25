package cn.xulei.day07.demo02;

import java.util.ArrayList;

public class Test01ArrayList {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("李白",100);
        Student s2 = new Student("白居易",200);
        Student s3 = new Student("李清照",300);
        Student s4 = new Student("杜甫",400);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}
