package Month1_week1.var_args;

public class TestDriver {

	public static void main(String[] args) {
		System.out.println(getSum(1,2,3,4,5));
		System.out.println(getSum(1,2));
		System.out.println(getSum(7.9,1,2,3,4,5));
		System.out.println(getSum(9.0));
	}
	//can be called with 0 or more integer type parameters
	private static int getSum(int ...elements) {
		int sum = 0;
		System.out.println("TOtal elements are "+ elements.length);
		for(int i: elements)
		{
			sum+=i;
		}
		return sum;
	}
	
	//can be called with atleast 1 double and 0 or more integer type parameters
	private static double getSum(double d ,int ...elements) {
		int sum = 0;
		for(int i: elements)
		{
			sum+=i;
		}
		return (sum+d);
	}
}
