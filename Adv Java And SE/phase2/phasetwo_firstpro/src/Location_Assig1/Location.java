package Location_Assig1;

public class Location {
	
	private int Pincode;
	private String city;
	
	public Location() {
		
	}
	public Location(int pincode, String city) {
		
		Pincode = pincode;
		this.city = city;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
