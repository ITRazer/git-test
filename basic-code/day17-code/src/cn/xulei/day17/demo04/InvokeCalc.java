package cn.xulei.day17.demo04;

public class InvokeCalc {
    public static void main(String[] args) {
        invokeCalc(120,130,(int a,int b) -> {
            return a + b;
        });
    }
    private static void invokeCalc(int a,int b,Calculator calculator)
    {
        int result = calculator.calc(a,b);
        System.out.println("结果是:" + result);
    }
}
