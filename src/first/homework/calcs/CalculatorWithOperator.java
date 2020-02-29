package first.homework.calcs;

public class CalculatorWithOperator {


    public static double plus(double a, double b) {
        return a + b;
    }

    public static double minus(double a, double b) {
        return a - b;
    }

    public static double multiple(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double power (double a, double b) {
        for (a = 2; a <= b; a++) {
            a = a * a;
        }
        return a;
    }

    public static double abs (double a) {
        if (a >= 0) {
            return a;
        } else return -1 * a;
    }

    public double sqrt(double a, double b){
        double q = 1;
        double w;
        do {
            double r = q + (a - q)/2;
            w = r * r;
            if (w > q) {
                a = r;
            }
            else q = r;
        } while ((abs((float)(w - q)))>b);
        return a;
    }
}





