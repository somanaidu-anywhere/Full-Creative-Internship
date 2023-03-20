package Month1_week2.serialization;

import java.io.Serializable;

public class Student implements Serializable {
	int id;
	transient String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=");
		builder.append(id);
		builder.append(" name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
}
