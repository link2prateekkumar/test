package com.prateek.hibernateTesting;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtill {
	
	private static final SessionFactory sessionFactory= builSessionFactory();
	
	public static SessionFactory builSessionFactory(){
		
		Configuration configuration=new Configuration().configure();
		StandardServiceRegistryBuilder builder =new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory sessionFactory=configuration.buildSessionFactory(builder.build());
		
		return sessionFactory;
		
	}
	
	

}
