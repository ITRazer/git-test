package cn.xulei.day11.demo01;

/*
    角色类
 */
public class Role {
    int id;//角色id
    int blood;//生命值
    String name;//名称

    //添加武器属性
    Weapon wp;
    //添加盔甲属性
    Armour ar;

    public Weapon getWp() {
        return wp;
    }

    public void setWp(Weapon wp) {
        this.wp = wp;
    }

    public Armour getAr() {
        return ar;
    }

    public void setAr(Armour ar) {
        this.ar = ar;
    }

    public void attack()
    {
        System.out.println("使用" + wp.getName() + ", 造成" + wp.getHurt() + "伤害");
    }
    public void wear()
    {
        this.blood += ar.getProtect();
        System.out.println("穿上"+ar.getName()+", 生命值增加"+ar.getProtect());
    }
}
