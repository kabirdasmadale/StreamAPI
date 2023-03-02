package StreamDemo;

import java.util.stream.Stream;

public class ByUsingOfMethods {
	public static void main(String[] args) {
		Stream<Integer> of = Stream.of(11,22,33,44,90,55,65,6,88);
		of.forEach((i)->System.out.println(i));
		
	}

}
