package StreamDemo;

import java.util.stream.Stream;

public class ByUsingOfMethodDemo {
	
	public static void main(String[] args) {
		Stream<String> of = Stream.of("Santosh","Manoj","kedar","shivkumar","Harinath","dippak","madhukar","Ganesh");
	
	of.forEach((i)->System.out.println(i));
	}

}
