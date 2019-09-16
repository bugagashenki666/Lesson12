import java.util.Map;

public abstract class UnaryOperation implements Expression{
    protected Expression expression;

    public UnaryOperation(Expression expression) {
        this.expression = expression;
    }
    @Override
    public abstract int calculate(Map<String, Integer> values);
}
