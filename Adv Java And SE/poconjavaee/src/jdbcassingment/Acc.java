package jdbcassingment;

public class Acc {
	
	private int acno,pin,balance;

	public int getAcno() {
		return acno;
	}

	public void setAcno(int acno) {
		this.acno = acno;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Acc(int acno, int pin, int balance) {
	
		this.acno = acno;
		this.pin = pin;
		this.balance = balance;
	}

	public Acc() {
		
		// TODO Auto-generated constructor stub
	}
	
	

}
