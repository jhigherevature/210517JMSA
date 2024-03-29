package comparisons;

/*
 * When using the Comparable interface, we specify the
 * datatype we want to compare using generics (we are
 * telling the Comparable interface, we want to compare
 * our class 'Data' to other objects are are 'Data' objects
 */
public class Data implements Comparable<Data> {
	private int id;
	private double weight;

	@Override
	public int compareTo(Data input) {
		if (this.id > input.getId()) {
			return -1;
		} else if (this.id < input.getId()) {
			return 1;
		} else {
			return 0;
		}
	}

	// parameterized constructor
	public Data(int id, double weight) {
		this.id = id;
		this.weight = weight;
	}

	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	// toString method
	@Override
	public String toString() {
		return "Data [id:" + this.id + ", weight:"+this.weight+"]";
	}
}
