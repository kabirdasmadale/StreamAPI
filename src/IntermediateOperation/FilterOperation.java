package IntermediateOperation;

import java.util.stream.Stream;

public class FilterOperation {
	public static void main(String[] args) {
		Stream<Integer> of = Stream.of(11,22,43,34,55,65,87);
		Stream<Integer> filter = of.filter((i)->i>=43);
		filter.forEach((i->System.out.println(i)));
	}

}
