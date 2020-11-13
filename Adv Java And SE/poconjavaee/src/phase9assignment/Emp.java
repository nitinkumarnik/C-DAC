package phase9assignment;

public class Emp {
	private int empno;
	private String empname,email,city;
	
	
	public Emp(int empno, String empname, String email, String city) {
		super();
		this.empno = empno;
		this.empname = empname;
		this.email = email;
		this.city = city;
	}
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
