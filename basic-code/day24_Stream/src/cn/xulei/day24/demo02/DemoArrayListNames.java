package cn.xulei.day24.demo02;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayListNames {
    public static void main(String[] args) {
        //第一支队伍
        ArrayList<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");
        //第二支队伍
        ArrayList<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("尼古拉斯赵四");
        two.add("张天爱");
        two.add("张二狗");

        //第一支队伍只要名字为3个的人
        List<String> oneA = new ArrayList<>();
        for (String name : one)
        {
            if (name.length() == 3){
                oneA.add(name);
            }
        }

        //第一支队伍只有要前三个人
        List<String> oneB = new ArrayList<>();
        for (int i = 0; i <3; i++) {
           oneB.add(oneA.get(i));
        }

        //第二个队伍只要姓张的人
        List<String> twoA = new ArrayList<>();
        for (String name : two){
            if (name.startsWith("张")){
                twoA.add(name);
            }
        }

        //第二只队伍不要前两个人
        List<String> twoB = new ArrayList<>();
        for (int i = 02; i < twoA.size(); i++) {
            twoB.add(twoA.get(i));
        }

        //将两支队伍合并
        List<String> total = new ArrayList<>();
        total.addAll(oneB);
        total.addAll(twoB);

        //根据姓名创建Person对象
        List<Perosn> totalPerson = new ArrayList<>();
        for (String name :
                total) {
            totalPerson.add(new Perosn(name));
        }

        for (Perosn perosn : totalPerson)
        {
            System.out.println(perosn);
        }
    }
}
