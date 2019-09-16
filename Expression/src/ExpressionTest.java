import java.util.HashMap;
import java.util.Map;

public class ExpressionTest {
    public static void main(String[] args) {

//x^2-x^3+2*x-4
        /*Expression x = new Variable("x");
        Expression mul = new Multiple(x, x);
        Expression mul2 = new Multiple(x , new Multiple(x, x));
        Expression mul3 = new Multiple(new Const(2), x);
        Expression minus = new Minus(mul, mul2);
        Expression plus = new Plus(minus, mul3);
        Expression minus2 = new Minus(plus, new Const(4));
        Expression max = new Max(minus2);*/
        Expression x2 = new Power(new Variable("x"), new Const(2));
        Expression x3 = new Power(new Variable("x"), new Const(3));
        Expression mul = new Multiple(new Const(2), new Variable("x"));
        Expression minus = new Minus(x2, x3);
        Expression plus =  new Plus(minus, mul);
        Expression result = new Minus(plus, new Const(4));
        Expression max = new Max(result);
        Map<String, Integer> map = new HashMap<>();
        map.putIfAbsent("low", -100);
        map.putIfAbsent("high", 100);
        System.out.println("max = " + max.calculate(map) + " при x = " + map.get("max"));
    }
}
