package scopes;

import java.util.ArrayList;

public class Simulator {
	ArrayList list = new ArrayList();

	public static void main(String[] args) {
		StaticRestrictions sr = new StaticRestrictions();
		sr.nonStaticMethod();
		
		StaticRestrictions.staticMethod();
		
		System.out.println(Math.abs(-1234));
		System.out.println(sr.non_static_id);
		System.out.println(StaticRestrictions.static_id);
		System.out.println(sr.static_id); // inefficient, avoid doing this
	}

}
