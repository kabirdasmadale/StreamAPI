package IntermediateOperation;

import java.util.ArrayList;
import java.util.stream.Stream;

public class IntermediateOperationWithStreamMethod {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList();
		a.add(11);
		a.add(33);
		a.add(87);
		a.add(23);
		a.add(26);
		Stream <Integer>stream = a.stream();
		Stream filter = stream.filter((i)-> i<=33);
		filter.forEach((i)->System.out.println(i));
	}

}
