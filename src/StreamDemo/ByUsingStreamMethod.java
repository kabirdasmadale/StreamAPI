package StreamDemo;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ByUsingStreamMethod {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(11);
		al.add(21);
		al.add(13);
		al.add(15);
		al.add(13);
		al.add(19);
		al.add(15);
		al.add(18);
		Stream stream = al.stream();
		stream.forEach((i)->System.out.println(i));
	}

}
