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

    public int plus(int a, int b) {
        if (null != itog) {
            setCountOperation(Count);
            return itog.plus(a, b);
        } else if (null != itog2) {
            setCountOperation(Count);
            return itog2.plus(a, b);
        }
        return 0;
    }
    public int minus(int a, int b) {
        if (null != itog) {
            setCountOperation(Count);
            return itog.minus(a, b);
        } else if (null != itog2) {
            setCountOperation(Count);
            return itog2.minus(a, b);
        }
        return 0;
    }
    public int multiple(int a, int b) {
        if (null != itog) {
            setCountOperation(Count);
            return itog.multiple(a, b);
        } else if (null != itog2) {
            setCountOperation(Count);
            return itog2.multiple(a, b);
        }
        return 0;
    }
    public double divide(float a, float b) {
        if (null != itog) {
            setCountOperation(Count);
            return itog.divide(a, b);
        } else if (null != itog2) {
            setCountOperation(Count);
            return itog2.divide(a, b);
        }
        return 0;
    }

    public void setCountOperation (int Count){
        this.Count=Count+1;
    }
    public int getCountOperation () {
        return Count;
    }

}



