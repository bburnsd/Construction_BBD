package ProjectModule1;

public class Residential extends Building {
protected int numBedrooms;
protected int numBathrooms;
protected boolean laundryRoom;

public Residential() {
	
}
public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom) {
	this.projectName=projectName;
	this.completeAddress=completeAddress;
	this.totalSquareFeet=totalSquareFeet;
	this.occupancyGroup=occupancyGroup;
	this.subgroup=subgroup;
	this.numBedrooms=numBedrooms;
	this.numBathrooms=numBathrooms;
	this.laundryRoom=laundryRoom;
}
public void draw() {
	System.out.println("Drawing code for Residential");
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
	return sb.toString();
}
public void setNumBedrooms(int numBedrooms) {
	this.numBedrooms=numBedrooms;
}
public int getNumBedrooms() {
	return this.numBedrooms;
}
public void setNumBathrooms(int numBathrooms) {
	this.numBathrooms=numBathrooms;
}
public int getNumBathrooms() {
	return this.numBathrooms;
}
public void setLaundryRoom(boolean laundryRoom) {
	this.laundryRoom=laundryRoom;
}
public boolean getLaundryRoom() {
	return this.laundryRoom;
}
}
