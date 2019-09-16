import java.util.HashMap;
import java.util.Map;

public class Max extends UnaryOperation{
    public Max(Expression expression)
    {
        super(expression);
    }
    @Override
    public int calculate(Map<String, Integer> range)
    {
        int max = Integer.MIN_VALUE;
        for(int i = range.get("low") ; i <= range.get("high") ; i++)
        {
            Map map = new HashMap<String, Integer>();
            map.put("x", i);
            int current_value = this.expression.calculate(map);
            if(current_value > max)
            {
                max = current_value;
                if(!range.containsKey("max"))
                    range.put("max", i);
                else
                    range.replace("max", i);
            }
        }
        return  max;
    }
}
