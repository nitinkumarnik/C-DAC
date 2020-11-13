package poc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Eraser {
	
	@Column(name="eraserid")
	@Id
	private int eraserId;
	
	
	private int type;
	public int getEraserId() {
		return eraserId;
	}
	public void setEraserId(int eraserId) {
		this.eraserId = eraserId;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	/**
	 * 
	 */
	public Eraser() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param eraserId
	 * @param type
	 */
	public Eraser(int eraserId, int type) {
	
		this.eraserId = eraserId;
		this.type = type;
	}
	
	
	

}
