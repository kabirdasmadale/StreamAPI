package LamdaExpression;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
	public static void main(String[] args) {
		BiConsumer<Integer, Integer> biconsumer=(no,no1)->System.out.println(no*no1);
	biconsumer.accept(22, 32);
	}

}
