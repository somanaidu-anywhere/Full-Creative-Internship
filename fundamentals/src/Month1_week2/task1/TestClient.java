package Month1_week2.task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestClient {
public static void main(String[] args) throws IOException {
	File file = new File("F:\\Full-Creative-Internship\\fundamentals\\src\\Month1_week2\\task1\\myfile.txt");
	Scanner sc = new Scanner(System.in);
	System.out.println("Do you want to create new file? [yes/no]");
	String flag = sc.nextLine();
	if(flag.equals("yes")){
		System.out.println("Enter file name: ");
		String fname = sc.nextLine();
		file = new File("F:\\Full-Creative-Internship\\fundamentals\\src\\Month1_week2\\task1\\"+fname+".txt");
		file.createNewFile();
	}
	String message = sc.nextLine();
		writeTo(file,message);
}
private static void writeTo(File file, String message) {
	try {
		FileWriter fileWriter = new FileWriter(file);
		message = message.replaceAll(" ","\n");
		fileWriter.write(message);
		fileWriter.close();
		System.out.println("Successfully Written");
	} catch (IOException e) {
		System.out.println("IOException failed to write");
	}
	}
}