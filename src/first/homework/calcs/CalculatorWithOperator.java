package first.homework.calcs;

public class CalculatorWithOperator {

    public static void main(String[] args) {

         int c = plus(4, 9);
        int d = minus(34, 87);
        int i = multiple(4, 8);
        double f = divide(12, 12);
        double p = power (12, 3);
        double s = abs(-23);
        double k = sqrt(23);

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

    public static double divide(float a, float b) { return a / b; }

    public static double power (float a, float b) {return Math.pow (a, b); }

    public static double abs (float a) {
        if (a >= 0) {
            return a;
        } else return -1 * a;
    }

    public static double sqrt (float a) {return Math.sqrt (a); }


}





