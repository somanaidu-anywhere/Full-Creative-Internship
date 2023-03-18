package Month1_week2.practiceTask;

import java.util.Scanner;

public class TestClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select your choice of break fast items: ");
		System.out.println("1.Poori \n2.Idli\n3.Dosa\n4.NotInterested");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			getPoori();
			break;
		case 2:
			getIdli();
			break;
		case 3:
			getDosa();
			break;
		case 4:
			noThanks();
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
	}

	private static void noThanks() {
		System.out.println("No thanks");
		
	}

	private static void getDosa() {
		
	}

	private static void getIdli() {
		// TODO Auto-generated method stub
		
	}

	private static void getPoori() {
		// TODO Auto-generated method stub
		
	}

}
