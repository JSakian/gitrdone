package com.gitrdone;

import java.util.List;

public interface PersonDAO {

	boolean create(Person obj);
	Person findById(long personId);
	List<Person> getAll();
	boolean update(Person obj);
	boolean delete(Person obj);

}
