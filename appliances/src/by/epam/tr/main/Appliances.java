package by.epam.tr.main;

import java.util.Objects;

public class Appliances {

	private int price;
	public Appliances() {
		price=0;
	}
	public  Appliances(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appliances other = (Appliances) obj;
		return price == other.price;
	}
	@Override
	public String toString() {
		return "Appliances [price=" + price + "]";
	}
	
}
