package cn.xulei.day11.demo01;

public class Test {
    public static void main(String[] args) {
        Weapon wp = new Weapon("屠龙刀",9999);
        Armour ar = new Armour("麒麟甲",10000);

        Role r = new Role();

        r.setWp(wp);
        r.setAr(ar);
        r.attack();
        r.wear();
    }
}
