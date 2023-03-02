package LamdaExpression;

import java.util.function.Predicate;

public class PredicateDemo1 {
	public static void main(String[] args) {
		Predicate<String> predicate=(name)->name.length()>=7;
		boolean test = predicate.test("madale");
		if(test) {
			System.out.println("length of name is gretter than 7");
		}else {
			System.out.println("length of name is smaller than 7'");
		}
	}

}
