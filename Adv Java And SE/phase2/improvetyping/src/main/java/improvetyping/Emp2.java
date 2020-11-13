package improvetyping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp2 {

	@Id
	private int empno;
	
	private int mobileno;
	
	private int deptid;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public Emp2() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
