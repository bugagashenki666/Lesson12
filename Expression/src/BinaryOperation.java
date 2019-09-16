import java.util.Map;

public abstract class BinaryOperation implements Expression{
    protected Expression expression1;
    protected Expression expression2;

    public BinaryOperation(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }
    @Override
    public abstract int calculate(Map<String, Integer> values);
    abstract public int operation(int a, int b);
}
