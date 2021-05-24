package packone;

public class Encap {
	public String pubString = "public String";
	protected String proString = "protected String";
	String defString = "Default String";
	private String priString = "private String";
	
	public static void main(String[] args) {
		Encap e = new Encap();
		System.out.println(e.pubString);
		System.out.println(e.proString);
		System.out.println(e.defString);
		System.out.println(e.priString);
	}
}
