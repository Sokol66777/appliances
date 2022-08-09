package by.epam.tr.main;

import java.util.Objects;

public class Gadgets extends Appliances {

	private String portable;
	public Gadgets() {
		super();
		portable="";
	}
	public Gadgets(String portable) {
		super();
		this.portable=portable;
		
	}
	public Gadgets(String portable, int price) {
		super(price);
		this.portable=portable;
	}
	public String getPortable() {
		return portable;
	}
	public void setPortable(String portable) {
		this.portable = portable;
	}
	@Override
	public int hashCode() {
		return Objects.hash(portable);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gadgets other = (Gadgets) obj;
		return Objects.equals(portable, other.portable);
	}
	@Override
	public String toString() {
		return "Gadgets [portable=" + portable + "]";
	}
	
}
