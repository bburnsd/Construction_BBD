package ProjectModule1;

public class Building {
protected String projectName;
protected String completeAddress;
protected double totalSquareFeet;
protected String occupancyGroup;
protected String subgroup;

public Building() {
		
}
public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
	this.projectName=projectName;
	this.completeAddress=completeAddress;
	this.totalSquareFeet=totalSquareFeet;
	this.occupancyGroup=occupancyGroup;
	this.subgroup=subgroup;
}
public void draw() {
	
}
public String displayData() {
	StringBuilder sb = new StringBuilder();
	sb.append("Project Name = " + this.projectName + " ");
	sb.append("\nComplete Address = " + this.completeAddress + " ");
	sb.append("\nTotal Square Feet = " + this.totalSquareFeet + " ");
	sb.append("\nOccupancy Group = " + this.occupancyGroup + " ");
	sb.append("\nSubgroup = " + this.subgroup + " ");
	return sb.toString();
}
public void setProjectName(String projectName) {
	this.projectName=projectName;
}
public String getProjectName() {
	return this.projectName;
}
public void setCompleteAddress(String completeAddress) {
	this.completeAddress=completeAddress;
}
public String getCompleteAddress() {
	return this.completeAddress;
}
public void setTotalSquareFeet(double totalSquareFeet) {
	this.totalSquareFeet=totalSquareFeet;
}
public double getTotalSquareFeet() {
	return this.totalSquareFeet;
}
public void setOccupancyGroup(String occupancyGroup) {
	this.occupancyGroup=occupancyGroup;
}
public String getOccupancyGroup() {
	return this.occupancyGroup;
}
public void setSubgroup(String subgroup) {
	this.subgroup=subgroup;
}
}
