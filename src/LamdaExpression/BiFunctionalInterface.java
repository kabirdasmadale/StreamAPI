package LamdaExpression;

import java.util.function.BiFunction;

public class BiFunctionalInterface {
	public static void main(String[] args) {
		BiFunction<String, String, String> bifunction=(name1,name2)->(name1+name2);
	String apply = bifunction.apply("Kabordas", "  Madale");
	System.out.println(apply);
	}

}
