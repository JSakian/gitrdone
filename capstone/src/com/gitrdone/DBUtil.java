package com.gitrdone;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;

public class DBUtil {
	
	private static final EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("gitrdonePersistanceUnit");
	
	public static EntityManagerFactory getEmFactory() {
		return emf;
	}
	@Bean
	public PersonDAOImpl getPersonDAO() {
		return new PersonDAOImpl();
	}
	
	@Bean
	public EventDAOImpl getEventDAO() {
		return new EventDAOImpl();
	}

//	@Bean
//	public DemoServiceJpaImpl getDemoService() {
//	    return new DemoServiceJpaImpl();	
//	}
}
