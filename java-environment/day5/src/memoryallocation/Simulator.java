package memoryallocation;

public class Simulator {
	public static void main(String[] args) {
		Data d_1 = new Data(1);
		Data d_2 = new Data(1);
		System.out.println(d_1);
		System.out.println(d_2);
		
		System.out.println("Data: d_1.Id: "+ d_1.id);
		System.out.println("Data: d_2.Id: "+ d_2.id);
		System.out.println(d_1 == d_2);
	}
}
