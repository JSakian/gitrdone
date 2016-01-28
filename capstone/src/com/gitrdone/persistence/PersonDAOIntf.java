package com.gitrdone.persistence;

import java.util.List;

import com.gitrdone.beans.Person;

public interface PersonDAOIntf {

	void insert(Person obj);
//TODO method under construction
//	Person findById(long personId);
	List<Person> getAll();
	void update(Person obj);
	void delete(Person obj);

}
