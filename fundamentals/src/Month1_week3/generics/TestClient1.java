package Month1_week3.generics;

public class TestClient1<T> {
public static void main(String[] args) {
	Price<Integer> p = new Price<>();
	p.setMRP(100);
	p.setSellingPrice(95);
	System.out.println(p.isAtMax());
}
}
