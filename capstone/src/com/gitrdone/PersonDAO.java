package com.gitrdone;

import java.util.List;

public interface PersonDAO {

	public void insert(Person person);

	public void update(Person person);

	public void update(List<Person> persons);

	public void delete(int personId);

	public Person find(int personId);

	public List<Person> find(List<Long> personId);

	public List<Person> find(String email);

	public List<Person> find(boolean volunteer);

}
