package src2.first.homework.calcs;

import first.homework.calcs.CalculatorWithOperator;

public class Test_Math {
    public static void main(String[] args) {

        CalculatorWithOperator calculator2 = new CalculatorWithOperator();
        double a; a = 4.1;
        double b; b= 15;
        double c; c = 7;
        double d; d = 28;
         double e; e = 5;
        double s; s = 2;

        //4.1 + 15 * 7 + (28 / 5) ^ 2
        double result2 = calculator2.plus((calculator2.plus (a,calculator2.multiple(b, c))),
                calculator2.power(calculator2.divide(d, e), s) );

            System.out.println("Результат = " +result2);
            System.out.println("Результат / 0 = " +result2/0);
            System.out.println("Результат / 0.0d = " +result2/0.0d);
        }
    }



