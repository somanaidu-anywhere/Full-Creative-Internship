package Month1_week2.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable{
	int age;
	transient String name;
	private void readObject(ObjectInputStream in) throws ClassNotFoundException, IOException {
		in.defaultReadObject();
		System.out.println("De-Serialization started.....");
		name = (String)in.readObject();
	}
	private void writeObject(ObjectOutputStream out) throws ClassNotFoundException, IOException {
		out.defaultWriteObject();
		System.out.println("Serialization started.....");
		out.writeObject(name);
	}
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [age=");
		builder.append(age);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
}
