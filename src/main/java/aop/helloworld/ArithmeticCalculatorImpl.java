package aop.helloworld;

/**
 * Created by ray.liu on 2016/4/27.
 */
public class ArithmeticCalculatorImpl implements ArithmeticCalculator {
    public int add(int i, int j) {
        System.out.println("the method add begins with[" + i + "," + j + "]");
        int result = i + j;
        System.out.println("the method add end with " + result);
        return result;
    }

    public int sub(int i, int j) {
        System.out.println("the method sub begins with[" + i + "," + j + "]");
        int result = i - j;
        System.out.println("the method sub end with " + result);
        return result;
    }

    public int mul(int i, int j) {
        System.out.println("the method mul begins with[" + i + "," + j + "]");
        int result = i * j;
        System.out.println("the method mul end with " + result);
        return result;
    }

    public int div(int i, int j) {
        System.out.println("the method div begins with[" + i + "," + j + "]");
        int result = i / j;
        System.out.println("the method div end with " + result);
        return result;
    }
}
