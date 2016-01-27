
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
import com.gitrdone.persistence.ServiceImpl;

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
	public PersonDAOImpl getPersonDAOImpl() {
		return new PersonDAOImpl();
	}
	
	@Bean
	public EventDAOImpl getEventDAOImpl() {
		return new EventDAOImpl();
	}

	@Bean
	public ServiceImpl getServiceImpl() {
		return new ServiceImpl();
	}
}