package first.homework;

public class CalculatorWithOperator {

    public static void main(String[] args) {
        int c = plus(8, -15);
        int d = minus(34, 87);
        int i = multiple(4, 8);
        double f = divide(12, 12);
        double p = Math.pow(12, 3);
        int s = Math.abs(-23);
        double k = Math.sqrt(23);

        System.out.println(c);
        System.out.println(d);
        System.out.println(i);
        System.out.println(f);
        System.out.println(p);
        System.out.println(s);
        System.out.println(k);
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


    }



