package StreamDemo;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ByUsingStream1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("manmath");
		al.add("madhav");
		al.add("kumar");
		al.add("satish");
		al.add("viswanath");
		al.add("bharti");
		al.add("mahishmathi");
	//	System.out.println(al);
	Stream stream = al.stream();
	
	stream.forEach((a)->System.out.println(a));
	
	}

}
