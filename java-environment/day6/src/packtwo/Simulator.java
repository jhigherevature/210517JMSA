package packtwo;

import packone.Encap;

public class Simulator {

	public static void main(String[] args) {
		Encap e = new Encap();
		System.out.println(e.pubString);
		/*
		 * Both protected and Default access are
		 * not accessible outside of the package
		 * in which the class is defined...
		 * 
		 * What's the difference then?
		 */
//		System.out.println(e.proString);
//		System.out.println(e.defString);
//		System.out.println(e.priString);
	}

}
