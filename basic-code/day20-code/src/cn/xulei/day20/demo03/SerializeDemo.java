package cn.xulei.day20.demo03;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/*1. 把若干学生对象 ，保存到集合中。
2. 把集合序列化。
3. 反序列化读取时，只需要读取一次，转换为集合类型。
4. 遍历集合，可以打印所有的学生信息*/
public class SerializeDemo {
    public static void main(String[] args) throws Exception{
        Employee e = new Employee("张三",12);
        Employee e2 = new Employee("李四",22);
        Employee e3 = new Employee("王五",32);

        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(e);
        arrayList.add(e2);
        arrayList.add(e3);
        //序列化操作
        serializ(arrayList);

        //反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/list.txt"));
        //读取对象，强转换为ArrayList类型
        ArrayList<Employee> list = (ArrayList<Employee>)ois.readObject();
        for (int i = 0; i < list.size(); i++) {
            Employee employee = list.get(i);
            System.out.println(employee.getName() + "--" + employee.getAge());
        }
    }
    private static void serializ(ArrayList<Employee> arrayList) throws Exception{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/list.txt"));
        oos.writeObject(arrayList);
        oos.close();
    }

}
