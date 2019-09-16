import java.util.Map;

public class Variable implements Expression{
    String name;
    int value;
    public  Variable(String name)
    {
        this.name = name;
    }
    @Override
    public int calculate(Map<String, Integer> values)
    {
        this.value = values.getOrDefault(this.name, 1);
        return this.value;
    }
}
