package cn.xulei.annotation;

//使用自己的注解
@MyAnno(age = 1,per = Person.P1,anno2 = @MyAnno2,strs={"111","222"})
@MyAnno3
public class Worker {
    @MyAnno3
    private String name;
    @MyAnno3
    public void show(){

    }
}
