package EmployeeAssigOne;

public class emp 
{
	int empno;
	int deptid;
	int mobileno;
	
	
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	public emp(int empno, int deptid, int mobileno) {
		super();
		this.empno = empno;
		this.deptid = deptid;
		this.mobileno = mobileno;
	}
	public emp() {
		super();
	}

}
