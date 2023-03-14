package Month1_week2.flowcontrol;

public class TestClient {

	public static void main(String[] args) {
		int a = 10;
		//Simple if
		if(a>18) {
			System.out.println("Eligible for vote");
		}
		
		//if else
		if(a%2==0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd number");
		}
		
		//if else if else
		if(a==0) {
			System.out.println("Zero");
		}
		else if(a>0) {
			System.out.println("Positive number");
		}
		else {
			System.out.println("Negative number");
		}
		
		
		a=5;
		switch(a) {
		case 1:
			System.out.println("Hello");
			break;
		case 2:
			System.out.println("Hey");
			break;
		case 3:
			System.out.println("Haha");
			break;
		default:
			System.out.println("Default");
		}
		
		a = 5;
		while(a<10)
		{
			System.out.print(a+++" ");
		}
		a=9;
		do {
			System.out.print("Hi");
		}while(a<5);
		for(int i=0;i<10;i++) {
			System.out.print(i+" ");
		}
		int[] arr = {1,2,3,4,5,6};
		int sum = 0;
		for(int item: arr) {
			sum+=item;
		}
		System.out.println(sum);
	}
}