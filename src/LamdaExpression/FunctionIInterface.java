package LamdaExpression;

import java.util.function.Function;

public class FunctionIInterface {
	public static void main(String[] args) {
		Function<Integer, Integer> function=(no)->(no*no);
		Integer apply = function.apply(2);
		System.out.println(apply);
	}

}
