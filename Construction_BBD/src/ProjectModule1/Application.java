package ProjectModule1;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SingleFamilyHome gaines = new SingleFamilyHome("Gaines House","123 Main Street | Louisville, Kentucky 40201", 2540, "Residential","R1", true);
gaines.setNumBedrooms(4);
gaines.setNumBathrooms(3);
gaines.setLaundryRoom(true);
System.out.println(gaines.displayData());
Mall StMatthews = new Mall("Mall St. Matthews","5000 Shelbyville Rd, Louisville, KY 40207",1017000,"Business","B",0,3360);
System.out.println("\n" + StMatthews.displayData() + "\n");
StMatthews.draw();
	}

}
