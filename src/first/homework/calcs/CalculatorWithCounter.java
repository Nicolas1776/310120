package first.homework.calcs;

public class CalculatorWithCounter {

    private CalculatorWithOperator itog;
    private CalculatorWithMath itog2;
    int Count=0;

    public CalculatorWithCounter (CalculatorWithOperator itog){
        this.itog=itog;
    }
    public CalculatorWithCounter (CalculatorWithMath itog){
        this.itog2=itog;
    }


    public double plus(double a, double b) {
        if (null != itog) {
            return CalculatorWithOperator.plus(a, b);
        } else if (null != itog2) {
            return CalculatorWithMath.plus(a, b);
        }
        return 0;
    }
    public double minus(double a, double b) {
        if (null != itog) {
            return CalculatorWithOperator.minus(a, b);
        } else if (null != itog2) {
            return CalculatorWithMath.minus(a, b);
        }
        return 0;
    }
    public double multiple(double a, double b) {
        if (null != itog) {
            return CalculatorWithOperator.multiple(a, b);
        } else if (null != itog2) {
            return CalculatorWithMath.multiple(a, b);
        }
        return 0;
    }
    public double divide(double a, double b) {
        if (null != itog) {
            return CalculatorWithOperator.divide(a, b);
        } else if (null != itog2) {
            return CalculatorWithMath.divide(a, b);
        }
        return 0;
    }

    public int getCountOperation () {
        return Count;
    }

}



