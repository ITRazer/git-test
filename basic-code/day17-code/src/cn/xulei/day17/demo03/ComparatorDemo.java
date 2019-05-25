package cn.xulei.day17.demo03;

import java.util.Arrays;
import java.util.Comparator;
public class ComparatorDemo {
    public static void main(String[] args) {
        Person[] array = {
                new Person("古力娜扎", 19),
                new Person("迪丽热巴", 18),
                new Person("马尔扎哈", 20)};

        // 1.传统使用Comparator进行排序
       /* Comparator<Person> comp = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        Arrays.sort(array,comp);*/

       //2.使用lambda进行排序
       Arrays.sort(array,(Person a,Person b) ->{
           return a.getAge() - b.getAge();
       });

        for (Person person : array)
        {
            System.out.println(person);
        }
    }
}



