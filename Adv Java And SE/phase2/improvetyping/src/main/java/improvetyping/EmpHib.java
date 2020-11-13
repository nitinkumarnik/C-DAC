package improvetyping;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class EmpHib {
	
	public static void main(String[] args) {
		
		SessionFactory s = HibernateUtil.getSessionFactory();
		Session s1 = s.openSession();
		
		Query l = s1.createQuery("from Emp2");
		
		List<Emp2> el = l.list();
		
		for (Emp2 e : el)
		{
			System.out.println(e.getEmpno() +" == "+ e.getDeptid() + " == "+ e.getMobileno());
		}
	}
	
	public static void main2(String[] args) {
		
		SessionFactory s = HibernateUtil.getSessionFactory();
		Session s1 = s.openSession();
		Emp2 e = s1.get(Emp2.class, 1);
		
		if (e == null)
			System.out.println("No emp with this key.");
		else
		{
			System.out.println(e.getDeptid() + " -- "+ e.getMobileno());
			Transaction t = s1.beginTransaction();
			e.setDeptid(100);
			e.setMobileno(789654243);
			t.commit();
			System.out.println("updated...");
		}
		s1.close();
		s.close();
	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub

		Emp2 emp = new Emp2();
		
		SessionFactory s = HibernateUtil.getSessionFactory();
		Session s1 = s.openSession();
		Transaction y = s1.beginTransaction();
		
		emp.setEmpno(2);
		emp.setDeptid(002);
		emp.setMobileno(4561239);
		
		s1.save(emp);
		y.commit();
		s1.close();
		s.close();
		System.out.println("H...");
	}

}
