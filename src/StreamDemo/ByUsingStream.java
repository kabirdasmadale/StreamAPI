package StreamDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ByUsingStream {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(99);
		list.add(87);
		list.add(9);
		list.add(55);
		list.add(69);
		list.add(8);
		Stream stream = list.stream();
		stream.forEach((i)->System.out.println(i));
	}

}
