package StreamDemo;

import java.util.stream.Stream;

public class StreamApiDemo {
	public static void main(String[] args)  {
		//int a[]= {12,55,29,45,36,98,34,22,};
		
	 Stream<Integer> of = Stream.of(12,55,29,36,98,34,22,88);
	 
		of.forEach((i)-> System.out.println(i));
		
	}

}
