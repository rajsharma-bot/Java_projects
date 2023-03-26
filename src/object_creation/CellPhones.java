package object_creation;

public class CellPhones {

	String brandname;
	String model;
	double displaysize;
	String connectionType; //3G, 4G or 5G
	
	public void chargingSupport() {
		System.out.println("Charging is supported");
	}
	
	public void removableBattery() {
		System.out.println("Battery is removable");
	}
	
	public void inBulitBattery() {
		System.out.println("Batter is inbuilt");
	}
	
	public void universalChargingPort() {
		System.out.println("universal port should be C type");
	}
}
