package LamdaExpression;

import java.util.function.BiFunction;

public class BiFunctionalInterface1 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> biFunction=(no,no1)->(no+no1);
		Integer apply = biFunction.apply(8, 10);
		System.out.println(apply);
	}

}
