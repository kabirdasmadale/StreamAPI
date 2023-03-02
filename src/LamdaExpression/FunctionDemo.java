package LamdaExpression;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		Function<String, String> function=(name)->(name.toUpperCase());
		String apply = function.apply("i want to become a java developer");
		System.out.println(apply);
	}

}
