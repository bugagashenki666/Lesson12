import java.util.Map;

public class Plus extends BinaryOperation {

    public Plus(Expression expression1, Expression expression2)
    {
        super(expression1,expression2 );
    }
    @Override
    public int calculate(Map<String, Integer> values)
    {
        return operation(this.expression1.calculate(values) , this.expression2.calculate(values));
    }
    @Override
    public int operation(int a, int b)
    {
        return a + b;
    }
}
