import java.util.Map;

public class Divide extends BinaryOperation {

    public  Divide(Expression expression1, Expression expression2)
    {
        super(expression1,expression2);
    }
    @Override
    public int calculate(Map<String, Integer> values)
    {
        return this.operation(expression1.calculate(values), expression2.calculate(values));
    }
    @Override
    public int operation(int a, int b) {
        return a/b;
    }
}
