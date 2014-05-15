package com.prateek.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.prateek.hibernateTesting.HibernateUtill;

public class OneToOneTest {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory=HibernateUtill.builSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		Country country=new Country("india",2300000);
		Capital capitalIndia= new Capital("Delhi",30000);
		country.setCapital(capitalIndia);
		
		session.beginTransaction();
		session.save(country);
		session.save(capitalIndia);
		
		session.getTransaction().commit();
		
		session.close();
		

	}

}
