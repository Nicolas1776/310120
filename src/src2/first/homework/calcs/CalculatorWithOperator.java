package src2.first.homework.calcs;

public class CalculatorWithOperator {


    public  double plus(double a, double b) {
        return a + b;
    }

    public  double minus(double a, double b) {
        return a - b;
    }

    public  double multiple(double a, double b) {
        return a * b;
    }

    public  double divide(double a, double b) {
        return a / b;
    }

    public  double power (double a, double b) {
        for (a = 2; a <= b; a++) {
            a = a * a;
        }
        return a;
    }

    public  double abs (double a) {
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





