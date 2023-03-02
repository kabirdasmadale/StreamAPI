package StreamDemo;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ByUsingStreamMethodDemo {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(12);
		al.add(23);
		al.add(99);
		al.add(64);
		al.add(32);
		al.add(23);
		al.add(21);
		al.add(77);
		al.add(15);
		Stream stream = al.stream();
		stream.forEach((i)->System.out.println(i));
	}

}
