package cn.xulei.day07.demo02;

public class Test01StudentArray {
    public static void main(String[] args) {
        // 创建学生数组
        Student[] students = new Student[3];

        // 创建学生对象
        Student s1 = new Student("曹操",20);
        Student s2 = new Student("张飞",30);
        Student s3 = new Student("关羽",40);

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        //遍历
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}
