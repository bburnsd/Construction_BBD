package ProjectModule1;

public class Business extends Building{
protected int numRentableUnits;

public Business() {
	
}
public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits) {
	this.projectName=projectName;
	this.completeAddress=completeAddress;
	this.totalSquareFeet=totalSquareFeet;
	this.occupancyGroup=occupancyGroup;
	this.subgroup=subgroup;
	this.numRentableUnits=numRentableUnits;
}
public void draw() {
	System.out.println("Drawing code for Business");
}
public String displayData() {
	StringBuilder sb = new StringBuilder();
	sb.append("Project Name = " + this.projectName + " ");
	sb.append("\nComplete Address = " + this.completeAddress + " ");
	sb.append("\nTotal Square Feet = " + this.totalSquareFeet + " ");
	sb.append("\nOccupancy Group = " + this.occupancyGroup + " ");
	sb.append("\nSubgroup = " + this.subgroup + " ");
	sb.append("\nNumber of rentable units = " + this.numRentableUnits);
	return sb.toString();
}
public void setNumRentableUnits(int numRentableUnits) {
	this.numRentableUnits = numRentableUnits;
}
public int getNumRentableUnits() {
	return this.numRentableUnits;
}
}
