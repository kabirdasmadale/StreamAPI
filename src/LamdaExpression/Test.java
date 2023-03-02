package LamdaExpression;

public class Test {
	public static void main(String[] args) {
		Gretting gretting=()-> System.out.println ("Namaskar");
		gretting.greet();
		
		Gretting gretting1=()-> System.out.println("hi");
		gretting1.greet();
	}

}
