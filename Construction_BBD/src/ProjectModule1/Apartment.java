package ProjectModule1;

public class Apartment extends Residential {
protected int numRentableUnits;
protected double avgUnitSize;
protected boolean parkingAvailable;

public Apartment() {
	
}
public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits, double avgUnitSize, boolean parkingAvailable) {
	this.projectName=projectName;
	this.completeAddress=completeAddress;
	this.totalSquareFeet=totalSquareFeet;
	this.occupancyGroup=occupancyGroup;
	this.subgroup=subgroup;
	this.numRentableUnits=numRentableUnits;
	this.avgUnitSize=avgUnitSize;
	this.parkingAvailable=parkingAvailable;
}
public void draw() {
	System.out.print("Drawing code for Apartment");
}
public String displayData() {
	StringBuilder sb = new StringBuilder();
	sb.append("Project Name = " + this.projectName + " ");
	sb.append("\nComplete Address = " + this.completeAddress + " ");
	sb.append("\nTotal Square Feet = " + this.totalSquareFeet + " ");
	sb.append("\nOccupancy Group = " + this.occupancyGroup + " ");
	sb.append("\nSubgroup = " + this.subgroup + " ");
	sb.append("\nNumber of bedrooms = " + this.numBedrooms);
	sb.append("\nNumber of bathrooms = " + this.numBathrooms);
	sb.append("\nIs there a laundry room = " + this.laundryRoom);
	sb.append("\nNumber of rentable units = " + this.numRentableUnits);
	sb.append("\nAverage size of unit = " + this.avgUnitSize);
	sb.append("\nIs parking available = " + this.parkingAvailable);
	return sb.toString();
}
public void setNumRentableUnits(int numRentableUnits) {
	this.numRentableUnits=numRentableUnits;
}
public int getNumRentableUnits() {
	return this.numRentableUnits;
}
public void setAvgUnitSize(double avgUnitSize) {
	this.avgUnitSize=avgUnitSize;
}
public double getAvgUnitSize() {
	return this.avgUnitSize;
}
public void setParkingAvailable(boolean parkingAvailable) {
	this.parkingAvailable=parkingAvailable;
}
public boolean getParkingAvailable() {
	return this.parkingAvailable;
}
}
