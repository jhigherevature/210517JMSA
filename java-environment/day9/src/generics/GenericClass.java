package generics;

/*
 * Generics are placeholders for an object type
 * that can be passed to a class.
 * 
 * They are most commonly used with data structures
 * to define the type of the collection.
 */
public class GenericClass<Placeholder> {
	private Placeholder info;
	
	public GenericClass (Placeholder info) {
		this.info = info;
	}
	
	public Placeholder getInfo() {
		return info;
	}
	
	public void setInfo(Placeholder info) {
		this.info = info;
	}

	public String toString() {
		return "GenericClass [info=" + info + "]";
	}	
}
