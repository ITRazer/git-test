package cn.xulei.test;

import cn.xulei.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    /**
     * 初始化方法
     * 用于资源的申请，所有测试方法在执行前都是执行这个方法
     */
    @Before
    public void init()
    {
        System.out.println("init....");
    }

    /**
     * 释放资源的方法
     * 在所有测试方法执行完毕后，都会自动调用这个方法
     */
    @After
    public void close()
    {
        System.out.println("close...");
    }
    /**
     * 测试add方法
     */
    @Test
    public void testAdd()
    {
        Calculator c = new Calculator();
        int result = c.add(1,2);

        //断言    我断言这个结果是3
        Assert.assertEquals(3,result);
    }
}
