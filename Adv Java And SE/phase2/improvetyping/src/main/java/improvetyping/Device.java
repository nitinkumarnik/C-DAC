package improvetyping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Device {
	
	@Id
	private int deviceid;
	
	private int status;
	
	private int resourceconsumed;

	public int getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(int deviceid) {
		this.deviceid = deviceid;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getResourceconsumed() {
		return resourceconsumed;
	}

	public void setResourceconsumed(int resourceconsumed) {
		this.resourceconsumed = resourceconsumed;
	}

	public Device() {
		// TODO Auto-generated constructor stub
	}
	
	

}
