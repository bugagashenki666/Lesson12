import java.util.HashMap;
import java.util.Map;

public class ExpressionTest {
    public static void main(String[] args) {
        /*Expression x = new Variable("x");
        Expression y = new Variable("y");
        Expression c = new Const(3);
        Expression plus = new Plus(x, c);
        Expression divide = new Divide(plus, y);

        Map<String, Integer> map = new HashMap<>();
        map.putIfAbsent("x", 1);
        map.putIfAbsent("y", 2);*/
//x^2-x^3+2*x-4
        Expression x = new Variable("x");
        Expression mul = new Multiple(x, x);
        Expression mul2 = new Multiple(x , new Multiple(x, x));
        Expression mul3 = new Multiple(new Const(2), x);
        Expression minus = new Minus(mul, mul2);
        Expression plus = new Plus(minus, mul3);
        Expression minus2 = new Minus(plus, new Const(4));
        Expression max = new Max(minus2);
        Map<String, Integer> map = new HashMap<>();
        map.putIfAbsent("low", -100);
        map.putIfAbsent("high", 100);
        System.out.println("max = " + max.calculate(map) + " при x = " + map.get("max"));
    }
}
