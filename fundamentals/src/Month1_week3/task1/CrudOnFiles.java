package Month1_week3.task1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CrudOnFiles {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		int f=0;
		File file = null;
		do {
			System.out.println("1. Create File\n2. Read File\n3. Update File\n4. Delete File\n5. Show Files\n0. Exit\n---------------------------");
			System.out.print("Select Choice[number]:");
			f = sc.nextInt();
			sc.nextLine();
			switch(f) {
			case 1:
				System.out.print("Enter file name: ");
				String fName = sc.nextLine();
				createFile(fName);
				break;
			case 2:
				file = getFile();
				readFile(file);
				break;
			case 3:
				file = getFile();
				System.out.println("Write Content Here: ");
				String message = sc.nextLine();
				writeFile(file,message);
				break;
			case 4:
				file = getFile();
				deleteFile(file);
				break;
			case 5:
				showFiles();
				break;
			case 0:
				System.out.println("Thank You!");
				break;
			default:
				System.out.println("Invealid Choice. Please Try again!");
				break;
			}
		}while(f!=0);
	}
	private static void createFile(String fName) throws IOException
	{
		File file = new File("F:\\Full-Creative-Internship\\fundamentals\\src\\Month1_week3\\\\task1\\\\files\\"+fName+".txt");
		file.createNewFile();
	}
	private static void readFile(File fName) throws IOException {
		FileReader reader = new FileReader(fName);
		System.out.println("---------------------------");
		String f =null;
		BufferedReader br = new BufferedReader(reader);
		do {
			f = br.readLine();
			if(f==null)
				break;
			System.out.println(f);
		}while(true);
		reader.close();
		System.out.println("---------------------------\n"+fName.getName()+" read successfully.\n---------------------------");
	}
	private static void writeFile(File fName,String message) throws IOException
	{
			FileWriter fileWriter = new FileWriter(fName);
			fileWriter.write(message);
			fileWriter.close();
			System.out.println("---------------------------\n"+fName.getName()+" updated successfully.\n---------------------------");
	}
	private static void deleteFile(File fName) {
		fName.delete();
		System.out.println("---------------------------\n"+fName.getName()+" deleted successfully.\n---------------------------");
	}
	private static File getFile() {
		File file = new File("F:\\Full-Creative-Internship\\fundamentals\\src\\Month1_week3\\task1\\files\\");
		String contents[] = file.list();
		for(int i=0;i<contents.length;i++) {
			System.out.println((i+1)+". "+contents[i]);
		}
		System.out.print("Select Choice[number]:");
		int choice = sc.nextInt();
		sc.nextLine();
		file = new File("F:\\Full-Creative-Internship\\fundamentals\\src\\Month1_week3\\task1\\files\\"+contents[choice-1]);
		return file;
	}
	private static void showFiles()
	{
		File file = new File("F:\\Full-Creative-Internship\\fundamentals\\src\\Month1_week3\\task1\\files\\");
		String contents[] = file.list();
		for(int i=0;i<contents.length;i++) {
			System.out.print((i+1)+". "+contents[i]+"\t");
		}
		System.out.println("\n---------------------------");
	}
	}