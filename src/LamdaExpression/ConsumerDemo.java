package LamdaExpression;

import java.util.function.Consumer;

public class ConsumerDemo {
public static void main(String[] args) {
	Consumer<String> consumer=(name)->System.out.println(name);
	consumer.accept("kabirdas");
}
}
