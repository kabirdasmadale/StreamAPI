package StreamDemo;

import java.util.stream.Stream;

public class ByUsingOfMethod {
	public static void main(String[] args) {
		Stream<Integer> of = Stream.of(10,30,40,40,60,39);
		
		of.forEach((i)-> System.out.println(i));
		
	}

}
