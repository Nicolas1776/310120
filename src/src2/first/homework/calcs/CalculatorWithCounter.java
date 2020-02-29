package src2.first.homework.calcs;

import first.homework.calcs.CalculatorWithMath;
import first.homework.calcs.CalculatorWithOperator;

public class CalculatorWithCounter {

    private CalculatorWithOperator itog;
    private first.homework.calcs.CalculatorWithMath itog2;
    private int count=0;

    public CalculatorWithCounter (CalculatorWithOperator itog){
        this.itog=itog;
    }
    public CalculatorWithCounter (CalculatorWithMath itog){
        this.itog2=itog;
    }


    public double plus(double a, double b) {
        count++;
        if (null != itog) {
            return itog.plus(a, b);
        } else if (null != itog2) {
            return itog2.plus(a, b);
        }
        return 0;
    }
    public double minus(double a, double b) {
        count++;
        if (null != itog) {
            return itog.minus(a, b);
        } else if (null != itog2) {
            return itog2.minus(a, b);
        }
        return 0;
    }
    public double multiple(double a, double b) {
        count++;
        if (null != itog) {
            return  itog.multiple(a, b);
        } else if (null != itog2) {
            return itog2.multiple(a, b);
        }
        return 0;
    }
    public double divide(double a, double b) {
        count++;
        if (null != itog) {
            return itog.divide(a, b);
        } else if (null != itog2) {
            return itog2.divide(a, b);
        }
        return 0;
    }

    public int getCountOperation () {
        return count;
    }

}



