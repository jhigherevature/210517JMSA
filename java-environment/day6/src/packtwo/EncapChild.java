package packtwo;

import packone.Encap;

public class EncapChild extends Encap {
	public static void main(String[] args) {
		Encap e = new Encap();
		System.out.println(e.pubString);
		/*
		 * protected fields are not accessible
		 * from the parent class directly!
		 */
//		System.out.println(e.proString);
//		System.out.println(e.defString);
	}
	
	public void examine() {
		this.pubString = "child pub string";
		this.proString = "child pro string";
		/*
		 * error - default and private are not
		 * accessible to the child object
		 */
//		this.defString = "child def string"; 
	}
}
