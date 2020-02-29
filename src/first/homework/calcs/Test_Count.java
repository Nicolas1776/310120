package first.homework.calcs;

public class Test_Count {
    public static void main(String[] args) {

        CalculatorWithCounter x = new CalculatorWithCounter();
        x.a = 4.1;
        x.b = 15;
        x.c = 7;
        x.d = 28;
        x.e = 5;
        x.s = 2;
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        x.result = CalculatorWithOperator.plus ((CalculatorWithOperator.plus (x.a, CalculatorWithOperator.multiple(x.b, x.c))),
                     CalculatorWithOperator.power(CalculatorWithOperator.divide(x.d, x.e), x.s) );
        System.out.printf("Вывели через getCountOperation ", +x.getCountOperation());
        x.print();
    }

    static class CalculatorWithCounter  {

        double a, b, c, d, e, s;
        double result;

        public double getCountOperation () {
            return result;
        }

        void print() {
            System.out.println("Результат = " +result);
            System.out.println("Результат / 0 = " +result/0);
            System.out.println("Результат / 0.0d = " +result/0.0d);
        }
    }
}
