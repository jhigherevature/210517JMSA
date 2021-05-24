package packone;

public class Simulator {
	public static void main(String[] args) {
		Encap e = new Encap();
		System.out.println(e.pubString);
		System.out.println(e.proString);
		System.out.println(e.defString);
		/*
		 * error - private variables are not visible
		 * outside of the class they are defined
		 */
//		System.out.println(e.priString);
	}
}
