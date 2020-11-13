package improvetyping;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class ShowPatience {
	
	
	//multi select
	public static void main3(String[] args) {
		
		SessionFactory s = HibernateUtil.getSessionFactory();
		Session s1 = s.openSession();
		Query l = s1.createQuery("from Item  where price > :abc");
		l.setParameter("abc", 300);
		
		List<Item> i = l.list();
		s1.close();
		s.close();
		for(Item x: i)
		{
			System.out.println(x.getItemno()  + "--" + x.getPrice());	
		}
	}
	
	
	//single select and upate
	public static void main2(String[] args) {
		SessionFactory s = HibernateUtil.getSessionFactory();
		Session s1 = s.openSession();
		Item x = s1.get(Item.class, 1);
		if( x == null)
		{
			System.out.println("no item with that primary key");
		}
		else
		{
			System.out.println(x.getItemno() + " -- " + x.getPrice());
			Transaction t = s1.beginTransaction();
			x.setPrice(500);
			t.commit();
		}
		s1.close();
		s.close();
	}

	
	//insert logic
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		Item x =new Item();
		x.setItemno(333);
		x.setPrice(444);
		SessionFactory s = HibernateUtil.getSessionFactory();
		Session s1 = s.openSession();
		Transaction y = s1.beginTransaction();
		s1.save(x);
		y.commit();
		s1.close();
		s.close();
		System.out.println("hello");
	}
}
