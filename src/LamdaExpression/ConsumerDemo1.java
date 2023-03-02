package LamdaExpression;

import java.util.function.Consumer;

public class ConsumerDemo1 {
	public static void main(String[] args) {
		Consumer<Integer> consumer=(no)->System.out.println(no*no);
		consumer.accept(10);
	}

}
