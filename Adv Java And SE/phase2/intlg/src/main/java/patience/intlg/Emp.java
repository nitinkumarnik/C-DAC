package patience.intlg;

public class Emp {
	
	private int empno;
	private String empname;
	private int deptid;
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
	
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	public Emp(int empno, String empname, int deptid) {
		this.empno = empno;
		this.empname = empname;
		this.deptid = deptid;
	}
	
	
}
