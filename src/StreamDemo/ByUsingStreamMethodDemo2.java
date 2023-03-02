package StreamDemo;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ByUsingStreamMethodDemo2 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("madhuri");
		al.add("priyanka");
		al.add("karina");
		al.add("aiswarya");
		al.add("ravina");
		al.add("kojel");
		
		Stream stream = al.stream();
		stream.forEach((i)->System.out.println(i));
		
		
	}

}
