package Design3;

public class OperationDiv extends Operation {
    public double getResult() {
       double result = 0;
        result = getNumberA() / getNumberB();
       return result;
    }
}