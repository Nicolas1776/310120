package src2.first.homework.calcs;

import first.homework.calcs.CalculatorWithOperator;

public class Test_Oper {

    public static void main(String[] args) {

        CalculatorWithOperator calculator = new CalculatorWithOperator();


        //4.1 + 15 * 7 + (28 / 5) ^ 2*/
        double result2 = calculator.plus((calculator.plus (4.1,calculator.multiple(15, 7))),
                calculator.power(calculator.divide(28, 5), 2) );

        System.out.println("Результат = " +result2);
        System.out.println("Результат / 0 = " + result2 / 0);
        System.out.println("Результат / 0.0d = " + result2 / 0.0d);
    }
}




