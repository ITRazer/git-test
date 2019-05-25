package cn.xulei.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Target：描述注解能够作用的位置
 * @Retention：描述注解被保留的阶段
 * @Documented：描述注解是否被抽取到api文档中
 * @Inherited：描述注解是否被子类继承
 */
@Target(value={ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})//表示该MyAnno3注解只能作用于类,方法,成员变量上
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno3 {

}
