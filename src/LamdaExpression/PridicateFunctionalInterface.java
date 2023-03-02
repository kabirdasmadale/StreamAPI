package LamdaExpression;

import java.util.function.Predicate;

public class PridicateFunctionalInterface {
	public static void main(String[] args) {
		Predicate<Integer> predicate=(i)->i%2==0;
	
	boolean test = predicate.test(22);
	System.out.println(test);
	}

}
