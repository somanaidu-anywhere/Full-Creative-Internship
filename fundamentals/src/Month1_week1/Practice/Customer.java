package Month1_week1.Practice;

public class Customer {
	private double amount;
	private String name;
	public Customer(double amount, String name) {
		super();
		this.amount = amount;
		this.name = name;
	}
	public Customer() {
		super();
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [amount=" + amount + ", name=" + name + "]";
	}
	public boolean orderFood(Hotel hotel,String item, int count) {
		double orderAmount = hotel.getMenu().get(item) * count;
		if(orderAmount<=amount) {
			amount -= orderAmount;
			return true;
		}
		else {
			return false;
		}
	}
}
