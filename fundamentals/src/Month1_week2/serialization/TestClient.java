package Month1_week2.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestClient {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee employee1 = new Employee(101,"Somanaidu");
		System.out.println(employee1);
		FileOutputStream fout1 = new FileOutputStream("serial1.ser");
		ObjectOutputStream oout1 = new ObjectOutputStream(fout1);
		oout1.writeObject(employee1);
		oout1.close();
		
		FileInputStream fin1 = new FileInputStream("serial1.ser");
		ObjectInputStream oin1 = new ObjectInputStream(fin1);
		Employee emp1 = (Employee)oin1.readObject();
		System.out.println(emp1);
		oin1.close();

		
		//transient keyword
		Student student1 = new Student(101,"Somanaidu");
		System.out.println(student1);
		FileOutputStream fout2 = new FileOutputStream("serial1.ser");
		ObjectOutputStream oout2= new ObjectOutputStream(fout2);
		oout2.writeObject(student1);
		oout2.close();

		FileInputStream fin2 = new FileInputStream("serial1.ser");
		ObjectInputStream ooin2 = new ObjectInputStream(fin2);
		Student stu1 = (Student)ooin2.readObject();
		System.out.println(stu1);
		ooin2.close();
	
		//callback methods
		Person person1 = new Person(101,"Somanaidu");
		System.out.println(person1);
		FileOutputStream fout3 = new FileOutputStream("serial1.ser");
		ObjectOutputStream oout3 = new ObjectOutputStream(fout3);
		oout3.writeObject(person1);
		oout3.close();

		FileInputStream fin3  = new FileInputStream("serial1.ser");
		ObjectInputStream oin3 = new ObjectInputStream(fin3);
		Person per1 = (Person)oin3.readObject();
		System.out.println(per1);
		oin3.close();
		
		//Externalization
		Driver t1 = new Driver(111,"Somanaidu");
		FileOutputStream fout4=new FileOutputStream("serial1.ser");
		ObjectOutputStream oout4=new ObjectOutputStream(fout4);
		oout4.writeObject(t1);
		oout4.close();
		
		FileInputStream fin4=new FileInputStream("serial1.ser");
		ObjectInputStream oin4=new ObjectInputStream(fin4);
		Driver t2=(Driver)oin4.readObject();

	}
}
