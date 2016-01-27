package com.gitrdone;

import java.util.List;

public interface PersonDAOIntf {

	void insert(Person obj);
//	Person findById(long personId);
//	TODO delete for cleanup if not needed
//	List<Person> getAll();
	void update(Person obj);
	void delete(Person obj);

}
