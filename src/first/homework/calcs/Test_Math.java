package first.homework.calcs;

public class Test_Math {
    public static void main(String[] args) {

        Calculator x = new Calculator();
        x.a = 4.1;
        x.b = 15;
        x.c = 7;
        x.d = 28;
        x.e = 5;
        x.s = 2;
        //4.1 + 15 * 7 + (28 / 5) ^ 2
        x.result = CalculatorWithMath.plus((CalculatorWithMath.plus (x.a,CalculatorWithMath.multiple(x.b, x.c))),
                CalculatorWithMath.power(CalculatorWithMath.divide(x.d, x.e), x.s) );
        x.print();
    }

    static class Calculator {

        double a, b, c, d, e;
        int s;
        double result;

        void print() {
            System.out.println("Результат = " +result);
            System.out.println("Результат / 0 = " +result/0);
            System.out.println("Результат / 0.0d = " +result/0.0d);
        }
    }
}


