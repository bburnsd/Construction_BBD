package ProjectModule1;

public class Mall extends Business {
protected double medianUnitSize;
protected int numParkingSpaces;

public Mall() {
	
}
public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, double medianUnitSize, int numParkingSpaces) {
	this.projectName=projectName;
	this.completeAddress=completeAddress;
	this.totalSquareFeet=totalSquareFeet;
	this.occupancyGroup=occupancyGroup;
	this.subgroup=subgroup;
	this.medianUnitSize=medianUnitSize;
	this.numParkingSpaces=numParkingSpaces;
}
public void draw() {
	System.out.println("Drawing code for Mall");
}
public String displayData() {
	StringBuilder sb = new StringBuilder();
	sb.append("Project Name = " + this.projectName + " ");
	sb.append("\nComplete Address = " + this.completeAddress + " ");
	sb.append("\nTotal Square Feet = " + this.totalSquareFeet + " ");
	sb.append("\nOccupancy Group = " + this.occupancyGroup + " ");
	sb.append("\nSubgroup = " + this.subgroup + " ");
	sb.append("\nNumber of rentable units = " + this.numRentableUnits);
	sb.append("\nMedian size of units " + this.medianUnitSize);
	sb.append("\nNumber of parking spaces = " + this.numParkingSpaces);
	return sb.toString();
}
public void setMedianUnitSize(double medianUnitSize) {
	this.medianUnitSize=medianUnitSize;
}
public double getMedianUnitSize() {
	return this.medianUnitSize;
}
public void setNumParkingSpaces(int numParkingSpaces) {
	this.numParkingSpaces=numParkingSpaces;
}
public int getNumParkingSpaces() {
	return this.numParkingSpaces;
}
}
