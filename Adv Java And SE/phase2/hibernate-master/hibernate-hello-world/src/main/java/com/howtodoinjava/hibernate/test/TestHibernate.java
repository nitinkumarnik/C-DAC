package com.howtodoinjava.hibernate.test;

import org.hibernate.Session;
import org.hibernate.query.Query;

//import com.howtodoinjava.hibernate.test.dto.EmployeeEntity;
import com.howtodoinjava.hibernate.test.dto.ItemEntity;

public class TestHibernate {
	
	
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		
		Query<ItemEntity> t = session.createQuery("from ItemEntity");
		
		for(ItemEntity i: t.list())
		{
			System.out.println(i.getItemno() + " -- " + i.getPrice());;
		}
		
		
		ItemEntity ite = session.get(ItemEntity.class, 2);
		if (ite == null) 
		{
			System.out.println("Not found.");
		}
		else 
		{
			System.out.println("Price: "+ ite.getPrice());
		}
		
		session.beginTransaction();
		
		ItemEntity it = new ItemEntity();
		it.setItemno(3);
		it.setPrice(95);
		
		session.save(it);
		
		session.getTransaction().commit();
		HibernateUtil.shutdown();
	}

}
