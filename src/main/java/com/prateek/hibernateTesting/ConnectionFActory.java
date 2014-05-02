package com.prateek.hibernateTesting;

import org.hibernate.SessionFactory;

public class ConnectionFActory {
	
	public SessionFactory getSession(){
		
		return new SeesionFactory();
	}

}
