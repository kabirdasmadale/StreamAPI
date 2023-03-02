package StreamDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ByUsingStreamMethods {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("kabirdas");
		list.add("sadashiv");
		list.add("nagesh");
		list.add("satish");
		list.add("pravin");
		list.add("padamakar");
		list.add("vitthal");
		list.add("bhimrao");
		Stream stream = list.stream();
		stream.forEach((i)->System.out.println(i));
		
	}

}
