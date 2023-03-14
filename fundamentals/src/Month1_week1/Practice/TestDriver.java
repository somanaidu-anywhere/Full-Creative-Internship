package Month1_week1.Practice;
import java.util.HashMap;
import java.util.Scanner;

public class TestDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer customer = new Customer(1000,"Somanaidu");
		Hotel hotel = new Hotel("Spicy Land",getDefaultMenu());
		int flag=0;
		do
		{
			System.out.println("Enter your choice:");
			System.out.println("1. Order Food");
			System.out.println("2. Water");
			System.out.println("3. Check Amount");
			System.out.println("4. Stop");
			flag = sc.nextInt();
			sc.nextLine();
			switch(flag)
			{
			case 1: 
				hotel.showMenu();
				System.out.print("Select Food : ");
				String item = sc.nextLine();
				System.out.println("Count : ");
				int count = sc.nextInt();
				sc.nextLine();
				
				try {
					
				if(customer.orderFood(hotel, item, count)){
					hotel.serve(item, count);
				}
				else {
					System.out.println("Please Check your Amount and try another food");
				}
				}
				catch(NullPointerException e) {
					System.out.println("Please Select an available item");
				}
				break;
			case 2:
				System.out.println("Take Water");
				break;
			case 3:
				System.out.println("Amount in Hand "+customer.getAmount());
			case 4:
				break;
			}
		}while(flag!=4);
		
	}
	public static HashMap<String,Double> getDefaultMenu(){
		
		HashMap<String,Double> menu = new HashMap<>();
		menu.put("Chapati", 50.0);
		menu.put("Samosa",30.0);
		menu.put("Chaat", 45.0);
		menu.put("Dosa", 80.0);
		menu.put("Chicken 65",155.0);
		menu.put("Biryani",199.0);
		return menu;
		
	}

}
