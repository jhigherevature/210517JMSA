package packone;

public class AccessMutate {
	private int id;
	private String name;
	private double weight;
	private int age;
	private boolean isAlive;
	
	public int getId() {
		return this.id;
	}
	private void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	protected double getWeight() {
		return weight;
	}
	void setWeight(double weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/*
	 * for booleans getters/accessors use 'is' instead
	 * of 'get'
	 */
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
}
