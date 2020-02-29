package src2.first.homework.calcs;

import first.homework.calcs.CalculatorWithCounter;
import first.homework.calcs.CalculatorWithMath;
import first.homework.calcs.CalculatorWithOperator;

public class Test_Count {
    public static void main(String[] args) {


        CalculatorWithMath math=new CalculatorWithMath();
        CalculatorWithOperator math2=new CalculatorWithOperator();
        CalculatorWithCounter count = new CalculatorWithCounter(math);
        CalculatorWithCounter count2 = new CalculatorWithCounter(math2);

        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;

        //4.1 + 15 * 7 + (28 / 5) ^ 2
        double result = count.plus ((count.plus (a, count.multiple(b,c))),
                count.multiple(count.divide(d, e), count.divide(d, e)) );

        System.out.println("Кол-во операций " +count.getCountOperation());
            System.out.println("Результат = " +result);
            System.out.println("Результат / 0 = " +result/0);
            System.out.println("Результат / 0.0d = " +result/0.0d);
        }
}

