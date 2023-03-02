package StreamDemo;

import java.util.stream.Stream;

public class ByUsingOfMethod1 {
	public static void main(String[] args) {
		Stream<Integer> of = Stream.of(19,20,30,40,99);
		of.forEach((i)-> System.out.println(i));
		
	}

}
