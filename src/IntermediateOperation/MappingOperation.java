package IntermediateOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MappingOperation {
	public static void main(String[] args) {
		List<String> list=new ArrayList();
		list.add("kabirdas");
		list.add("sanket");
		list.add("bharat");
		list.add("mangesh");
		list.add("raviraj");
		list.add("sopan");
		
		Stream <String>stream = list.stream();
		Stream<String> map = stream.map((name)-> name.toUpperCase());
		map.forEach((i)->System.out.println(i));
	}

}
