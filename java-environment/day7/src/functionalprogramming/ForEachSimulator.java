package functionalprogramming;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class ForEachSimulator {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		
		Scanner scan = new Scanner(System.in);
		
		names.add("Alice");
		names.add("Bob");
		names.add("Charrod");
		
		Consumer<String> c = (name) -> {System.out.println(name);};
		names.forEach(c);
		names.forEach( (name) -> {System.out.println(name);} );
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		for (String n : names) {
			System.out.println(n);
		}
	}

}
