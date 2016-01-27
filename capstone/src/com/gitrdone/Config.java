package com.gitrdone;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public EntityManagerFactory getEntityManagerFactory() {
		return Persistence.createEntityManagerFactory("gitrdonePersistanceUnit");
	}
	
	@Bean
	public EventDAO getEventDAO() {
		return new EventDAOImpl();
	}
	
	@Bean
	public PersonDAO getPersonDAO() {
		return new PersonDAOImpl();
	}
	
}
