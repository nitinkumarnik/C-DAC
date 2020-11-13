package Location_Assig1;

import java.util.List;



public class ServiceLayerTwo {
	
	private DAOLayertwo d;
		
		public ServiceLayerTwo()
		{
			d =new DAOLayertwo();
		}

	public boolean insertCityDetails(Location l) {
		return d.insertIntoDB(l);
	}

	public void closeResources() {
		d.closingResources();
		
	}

	public boolean updatedCityDetails(Location l) {
		
		return d.updateIntoDB(l);
	}

	public Location getdetails(int pinCode) {
		return d.getDetailsFromDB(pinCode);
	}

	public List<Location> getAllDetails(String city) {
		return d.getLocation(city);
	}

	

}
