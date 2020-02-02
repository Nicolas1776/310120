package first.homework;

public class CalculatorWithOperator {

    public static void main(String[] args) {
        int c = plus(8, -15);
        int d = minus(34, 87);
        int i = multiple(4, 8);
        double f = divide(12, 12);
        double p = power(12, 3);
        double s = abs(-23);


        System.out.println(c);
        System.out.println(d);
        System.out.println(i);
        System.out.println(f);
        System.out.println(p);
        System.out.println(s);
    }

    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiple(int a, int b) {
        return a * b;
    }

    public static double divide(float a, float b) {
        return a / b;
    }

    public static int power(int a, int b) {
        return a * a * a;
    }

    public static double abs(float a) {

        return -a;
    }


}
