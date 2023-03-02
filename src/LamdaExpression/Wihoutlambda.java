package LamdaExpression;

public class Wihoutlambda {
	public static void main(String[] args) {
		String[] str= {"kabirdas","manoj","satish","bhagvat","baliram","manmath","chandrashekhar"};
		for(String name:str) {
			if(name.startsWith("k")) {
				System.out.println(name);
			}else if (name.endsWith("j")){
				System.out.println(name);
			}
		}
	}

}
