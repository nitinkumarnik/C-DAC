package improvetyping;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class DeviceHib {

public static void main(String[] args) {
		
		SessionFactory s = HibernateUtil.getSessionFactory();
		Session s1 = s.openSession();
		
		Query l = s1.createQuery("from Device where status = :ab");
		l.setParameter("ab", 0);
		
		List<Device> d = l.list();
		
		for (Device dv : d)
		{
			System.out.println(dv.getDeviceid() +" == "+ dv.getResourceconsumed() + " == "+ dv.getStatus());
		}
	}
	
	public static void main2(String[] args) {
		
		SessionFactory s = HibernateUtil.getSessionFactory();
		Session s1 = s.openSession();
		Device d = s1.get(Device.class, 100);
		
		if (d == null)
			System.out.println("No device with this key.");
		else
		{
			System.out.println(d.getStatus() + " -- "+ d.getResourceconsumed());
			Transaction t = s1.beginTransaction();
			d.setStatus(0);
			d.setResourceconsumed(78);
			t.commit();
			System.out.println("updated...");
		}
		s1.close();
		s.close();
	}
	
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		Device dv = new Device();
		
		SessionFactory s = HibernateUtil.getSessionFactory();
		Session s1 = s.openSession();
		Transaction y = s1.beginTransaction();
		
		dv.setDeviceid(104);
		dv.setStatus(1);
		dv.setResourceconsumed(65);
		
		s1.save(dv);
		y.commit();
		s1.close();
		s.close();
		System.out.println("H...");

	}

}
