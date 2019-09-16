import java.util.Map;

public class Const implements Expression {
    private int value;

    @Override
    public int calculate(Map<String, Integer> values) {
        return this.value;
    }

    public Const(int value) {
        this.value = value;
    }

}
