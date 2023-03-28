package Month1_week3.generics;

public class Price<T extends Number> {
	private T sellingPrice;
	private T mRP;
	public T getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(T sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public T getMRP() {
		return mRP;
	}
	public void setMRP(T mRP) {
		this.mRP = mRP;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Price [sellingPrice=");
		builder.append(sellingPrice);
		builder.append(", MRP=");
		builder.append(mRP);
		builder.append("]");
		return builder.toString();
	}
	public boolean isAtMax() {
		return mRP == sellingPrice;
	}
}
