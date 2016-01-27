package com.gitrdone;

import java.util.List;

public interface PersonDAOIntf {

	boolean create(Person obj);
	Person findById(long personId);
//	TODO delete for cleanup if not needed
//	List<Person> getAll();
	boolean update(Person obj);
	boolean delete(Person obj);

}
