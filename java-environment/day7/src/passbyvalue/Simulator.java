package passbyvalue;

public class Simulator {
	
	public static void main(String[] args) {
		/*
		 * Java is a 'pass-by-value' language
		 * This means that when you provide arguments
		 * to methods, you only pass the value
		 * stored within those variables, not a 
		 * direct reference to the variable in 
		 * memory. You do not manipulate the values
		 * of variables unless you are referencing
		 * a class variable directly (using the 'this' 
		 * keyword, for example)
		 */
		int number = 10;
		changePrimitive(number);
		System.out.println("number is: " + number);
		
		Data d = new Data();
		System.out.println("Value of Data [before]: " + d.value);
		changeObject(d);
		System.out.println("Value of Data [after]: " + d.value);
	}
	
	public static void changePrimitive(int x) {
		x = 5;
		System.out.println("x is: " + x);
	}
	
	/*
	 * Java is exclusively a pass-by-value language
	 * However, the below example seems to run
	 * contrary to this idea...so what is going on?
	 * 
	 * What is the 'value' that is stored in a
	 * reference variable?...
	 */
	public static void changeObject(Data data) {
		data.value = 25;
	}
}
