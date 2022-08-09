package by.epam.tr.main;

import java.util.Objects;

public class Laptop extends Gadgets{

	private double batteryCapacity;
	private String OC;
	private int memoryRom;
	private int systemMemory;
	private double CPU;
	private int displayInchs;
	public Laptop() {
		super();
		batteryCapacity=0;
		OC="";
		memoryRom=0;
		systemMemory=0;
		CPU=0;
		displayInchs=0;
	}
	public Laptop(double batteryCapacity, String OC, int memoryRom, int systemMemory, double CPU,
			int displayInchs, String portable, int price) {
		super(portable,price);
		this.batteryCapacity=batteryCapacity;
		this.OC=OC;
		this.memoryRom=memoryRom;
		this.systemMemory=systemMemory;
		this.CPU=CPU;
		this.displayInchs=displayInchs;
	}
	public double getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public String getOC() {
		return OC;
	}
	public void setOC(String oC) {
		OC = oC;
	}
	public int getMemoryRom() {
		return memoryRom;
	}
	
	public void setMemoryRom(int memoryRom) {
		this.memoryRom = memoryRom;
	}
	public int getSystemMemory() {
		return systemMemory;
	}
	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}
	public double getCPU() {
		return CPU;
	}
	public void setCPU(double cPU) {
		CPU = cPU;
	}
	public int getDisplayInchs() {
		return displayInchs;
	}
	public void setDisplayInchs(int displayInchs) {
		this.displayInchs = displayInchs;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(CPU, OC, batteryCapacity, displayInchs, memoryRom, systemMemory);
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
		Laptop other = (Laptop) obj;
		return Double.doubleToLongBits(CPU) == Double.doubleToLongBits(other.CPU) && Objects.equals(OC, other.OC)
				&& Double.doubleToLongBits(batteryCapacity) == Double.doubleToLongBits(other.batteryCapacity)
				&& displayInchs == other.displayInchs && memoryRom == other.memoryRom
				&& systemMemory == other.systemMemory;
	}
	@Override
	public String toString() {
		return "Laptop [batteryCapacity=" + batteryCapacity + ", OC=" + OC + ", memoryRom=" + memoryRom
				+ ", systemMemory=" + systemMemory + ", CPU=" + CPU + ", displayInchs=" + displayInchs
				+ ", Portable=" + getPortable() + ", Price=" + getPrice() + "]";
	}
	
}
