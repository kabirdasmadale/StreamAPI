package StreamDemo;

import java.util.stream.Stream;

public class ByUsingOfDemo1 {
	public static void main(String[] args) {
		Stream<Integer> of = Stream.of(99,88,33,55,66,89);
		of.forEach((i)->System.out.println(i));
		
	}

}
