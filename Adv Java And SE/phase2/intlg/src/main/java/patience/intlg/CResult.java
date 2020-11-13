package patience.intlg;

public class CResult {
	
	private boolean status;
	private String message;
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public CResult() {
		// TODO Auto-generated constructor stub
	}
	
	public CResult(boolean status, String message) {
	
		this.status = status;
		this.message = message;
	}

}
