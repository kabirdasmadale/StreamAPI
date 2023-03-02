package IntermediateOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SlicingOperation {

	public static void main(String[] args) {
//3 methods in slicing operation distinct(),limit(),skip()
//this is the intermediate operations
		
		List list=new ArrayList();
		list.add("USA");
		list.add("INDIA");
		list.add("JAPAN");
		list.add("RASIA");
		list.add("INDIA");
		list.add("USA");
		System.out.println(list);
		Stream stream = list.stream();
		
		
		//Stream distinct = stream.distinct();
	//	distinct.forEach((i)->System.out.println(i));
		
	//	Stream limit = stream.limit(3);
	//	limit.forEach((i)->System.out.println(i));
		
		Stream skip = stream.skip(3);
		skip.forEach((i)->System.out.println(i));
		
	}

}
