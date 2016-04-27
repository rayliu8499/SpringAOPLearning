package aop.helloworld;

/**
 * Created by ray.liu on 2016/4/27.
 */
public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = null;
        arithmeticCalculator = new ArithmeticCalculatorImpl();

        int result = arithmeticCalculator.add(1, 2);
        System.out.println("===> " + result);
        result = arithmeticCalculator.div(4, 2);
        System.out.println("===> " + result);

    }
}
