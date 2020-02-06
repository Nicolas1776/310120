public class Calculator {

    double i;

    public static class Main {

        public static void main(String[] args) {

            Calculator x = new Calculator();
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
