package LamdaExpression;

import java.util.Date;
import java.util.function.Supplier;

public class SuplierDemo {
	public static void main(String[] args) {
		Supplier <Date> supplier=()->new Date();
		Date date = supplier.get();
		System.out.println(date);
	}

}
