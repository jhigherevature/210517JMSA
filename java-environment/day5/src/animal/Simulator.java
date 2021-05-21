package animal;

public class Simulator {

	public static void main(String[] args) {
		Dog scooby = new Dog("Scooby", "Great Dane", 100.00, 7);
		Dog fido = new Dog("Fido", "Golden Retriever", 60.0, 5);
		System.out.println(scooby.name);
		scooby.bark();
	}

}
