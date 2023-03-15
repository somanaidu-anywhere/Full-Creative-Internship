package Month1_week1.Practice;

import java.util.Scanner;

public class Intern {
	private byte id;
	private String name;
	public Intern() {
		super();
	}
	
	public Intern(byte id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void print() {
		System.out.println("id = "+this.id);
		System.out.println("name = "+this.name);
	}
	
	public byte getId() {
		return id;
	}
	public void setId(byte id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id: ");
		byte id = sc.nextByte();
		sc.nextLine();
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		Intern intern = new Intern();
		intern.setId(id);
		intern.setName(name);
		System.out.println("Id = "+intern.getId());
		System.out.println("Name = "+intern.getName());
		sc.close();
	}
}