
package com.gitrdone.config;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.gitrdone.EventDAOImpl;
import com.gitrdone.PersonDAOImpl;

@Configuration
@EnableWebMvc
@ComponentScan (basePackages={"com.gitrdone"})
public class SpringMVCConfig {
	
	@Bean
	public InternalResourceViewResolver getInternalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Bean
	EntityManagerFactory getEntityManagerFactory() {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("gitrdonePersistanceUnit");
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

}