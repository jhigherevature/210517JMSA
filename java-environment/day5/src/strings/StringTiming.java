package strings;

public class StringTiming {
	// This is used to determine how many objects we create
	static int n = 400_000;
	
	public static void main(String[] args) {
		createAlotOfStrings();
		createAlotStringBuilder();
		createAlotStringBuffer();
	}
	
	public static void createAlotOfStrings() {
		String s = "";
		long timeStart = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			s = s.concat("a");
		}
		long timeEnd = System.currentTimeMillis();
		System.out.println("Strings took: " + (timeEnd - timeStart) + "ms");
	}
	
	public static void createAlotStringBuilder() {
		StringBuilder sb = new StringBuilder("");
		long timeStart = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			sb.append("a");
		}
		long timeEnd = System.currentTimeMillis();
		System.out.println("StringBuilder took: " + (timeEnd - timeStart) + "ms");
	}

	public static void createAlotStringBuffer() {
		StringBuffer sb = new StringBuffer("");
		long timeStart = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			sb.append("a");
		}
		long timeEnd = System.currentTimeMillis();
		System.out.println("StringBuffer took: " + (timeEnd - timeStart) + "ms");
	}
}
