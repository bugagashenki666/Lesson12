import java.util.Map;

public class Power extends BinaryOperation{
    public Power(Expression expression1, Expression expression2)
    {
       super(expression1,expression2);
    }
    public int calculate(Map<String, Integer> values)
    {
        return this.operation( this.expression1.calculate(values), this.expression2.calculate(values));
    }
    public int operation(int a, int b)
    {
        //return (int)Math.pow(a, b);
        int result = 1;
        for(int i = 0 ; i < b ; i++)
            result = result * a;
        return result;
    }
}
