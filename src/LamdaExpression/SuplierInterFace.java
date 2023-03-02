package LamdaExpression;

import java.util.function.Supplier;

public class SuplierInterFace {
	public static void main(String[] args) {
		Supplier<Integer> suplier=()-> (10+10);
	Integer integer = suplier.get();
	System.out.println(integer);
	}

}
