package ProjectModule1;

public class SingleFamilyHome extends Residential {
protected boolean garage;

public SingleFamilyHome() {
	
}
public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, boolean garage) {
	this.projectName=projectName;
	this.completeAddress=completeAddress;
	this.totalSquareFeet=totalSquareFeet;
	this.occupancyGroup=occupancyGroup;
	this.subgroup=subgroup;
	this.garage=garage;
}
public void draw() {
	System.out.println("Drawing code for Single Family Home");
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
	sb.append("\nIs there a garage = " + this.garage);
	return sb.toString();
	
}
public void setGarage(boolean garage) {
	this.garage=garage;
}
public boolean getGarage() {
	return this.garage;
}
}
