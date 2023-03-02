package LamdaExpression;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		Predicate<Integer> predicate=(i)-> i>30;
		boolean test = predicate.test(20);
		if(test) {
			System.out.println("number is gretter than 30");
		}else {
			System.out.println("number is smaller than 30");
		}
	}

}
