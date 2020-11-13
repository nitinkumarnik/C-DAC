package poc;

public class RS {

	private int status;
	private String messsage;
	
	
	public int getStatus() {
		return status;
	}
	public String getMesssage() {
		return messsage;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public void setMesssage(String messsage) {
		this.messsage = messsage;
	}
	/**
	 * 
	 */
	public RS() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param status
	 * @param messsage
	 */
	public RS(int status, String messsage) {
		
		this.status = status;
		this.messsage = messsage;
	}
	
	
}
