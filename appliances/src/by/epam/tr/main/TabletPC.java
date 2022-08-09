package by.epam.tr.main;

import java.util.Objects;

public class TabletPC extends Gadgets{
	private double batteryCapacity;
	private int memoryRom;
	private int displayInchs;
	private int flashMemoryCapacity;
	private String color;
	public TabletPC() {
		super();
		this.batteryCapacity=0;
		this.color="";
		this.displayInchs=0;
		this.flashMemoryCapacity=0;
		this.memoryRom=0;
	}
	public TabletPC(double batteryCapacity, int memoryRom, int displayInchs, int flashMemoryCapacity,
			String color, String portable, int price) {
		super (portable,price);
		this.batteryCapacity=batteryCapacity;
		this.color=color;
		this.displayInchs=displayInchs;
		this.flashMemoryCapacity=flashMemoryCapacity;
		this.memoryRom=memoryRom;
	}
	public double getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public int getMemoryRom() {
		return memoryRom;
	}
	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}
	public int getDisplayInchs() {
		return displayInchs;
	}
	public void setDisplayInchs(int displayInchs) {
		this.displayInchs = displayInchs;
	}
	public int getFlashMemoryCapacity() {
		return flashMemoryCapacity;
	}
	public void setFlashMemoryCapacity(int flashMemoryCapacity) {
		this.flashMemoryCapacity = flashMemoryCapacity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(batteryCapacity, color, displayInchs, flashMemoryCapacity, memoryRom);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TabletPC other = (TabletPC) obj;
		return Double.doubleToLongBits(batteryCapacity) == Double.doubleToLongBits(other.batteryCapacity)
				&& Objects.equals(color, other.color) && displayInchs == other.displayInchs
				&& flashMemoryCapacity == other.flashMemoryCapacity && memoryRom == other.memoryRom;
	}
	@Override
	public String toString() {
		return "TabletPC [batteryCapacity=" + batteryCapacity + ", memoryRom=" + memoryRom + ", displayInchs="
				+ displayInchs + ", flashMemoryCapacity=" + flashMemoryCapacity + ", color=" + color
				+ ", Portable=" + getPortable() + ", Price=" + getPrice() + "]";
	}
	
}
