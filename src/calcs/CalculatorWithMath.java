package calcs;

public class CalculatorWithMath {

    public static void main(String[] args) {


        float i = 5;
        float k = -10;
        double power = Math.pow(i, k);
        float abs = Math.abs(k);
        double sqrt = Math.sqrt(i);
        int c = plus(8, -15);
        int d = minus(34, 87);
        int u = multiple(4, 8);
        double f = divide(12, 12);

        System.out.println(c);
        System.out.println(d);
        System.out.println(i);
        System.out.println(u);
        System.out.println(f);
        System.out.println(power);
        System.out.println(sqrt);
        System.out.println(abs);
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
    public class Calculator {

        double i;

        public  class Main {

            public  void main(String[] args) {

                calcs.Calculator x = new calcs.Calculator();
                x.i = 0;

                double a = 4.1;
                int b = 15;
                int c = 7;
                float d = 28;
                float e = 5;
                int s = 2;
                double divide = d/e;
                int multiple = b * c;
                double power = Math.pow(divide,s);
                double q = a + multiple + power;
                double i = q;
                System.out.println(q);
                double p = q/0;
                System.out.println(p);
                double h = q/0.0d;
                System.out.println(h);




            }
        }
    }

}
