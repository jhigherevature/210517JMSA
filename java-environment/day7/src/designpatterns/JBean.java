package designpatterns;

import java.io.Serializable;

/*
 * The following is a representation of a Java Bean,
 * which is a design pattern using certain conventions
 * which describe a template for objects that can
 * easily be used in automated frameworks, and follow
 * conventions other developers can expect 
 */
public class JBean implements Serializable {
	private int id;
	private String name;
	public JBean() {
		super();
	}
	/*
	 * Constrcutor initializing fields is not required, 
	 * but oftentimes used with Java Beans
	 */
	public JBean(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JBean other = (JBean) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "JBean [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}
