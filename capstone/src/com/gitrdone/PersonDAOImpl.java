package com.gitrdone;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class PersonDAOImpl implements PersonDAO {

		List<Person> personList;
	
		public PersonDAOImpl() {
			Person person1 = new Person();
			person1.setPersonId(1);
			person1.setFirstName("Happy");
			person1.setLastName("Gilmore");
			person1.setEmail("HappyHappy@gmail.com");
			person1.setComments("Ready to volunteer");
			person1.setPhone("2101234567");
			person1.setVolunteering(true);
			
			Person person2 = new Person();
			person2.setPersonId(2);
			person2.setFirstName("Billy");
			person2.setLastName("Madison");
			person2.setEmail("radioShow@gmail.com");
			person2.setComments("Ready to ROCK!");
			person2.setPhone("2102234568");
			person2.setVolunteering(false);
			
			personList.add(person1);
			personList.add(person2);
			
		}
		@Override
		public void insert(Person person){
			personList.add(person);
			
		}
		@Override
		public void update(Person person){
			personList.add(person);
		}
		@Override
		public void update(List<Person> persons){
			for(Person person:persons){
				update(person);
			}
		}
		@Override
		public void delete(int personId){
			personList.remove(personId);
		}
		@Override
		public Person find(int personId){
			return personList.get(personId);
		}
//		@Override
//		public List<Person> find(List<Long> personIds){
//			List<Person> persons = new ArrayList<>();
//			for(int id:personIds){
//				persons.add(personList.get(id));
//			}
//			return persons;
//		}
//		@Override
//		public List<Person> find(String email) {
//			List<Person> persons = new ArrayList<>();
//			for(Person person:personList.get(index){
//				if(email.equals(person.getEmail())){
//					persons.add(person);
//				}
//			}
//		}
//		@Override
//		public List<Person> find(boolean volunteer){
//			List<Person> persons = new ArrayList<>();
//			for(Person person:personList.contains())){
//				if(volunteer == person.isVolunteering()){
//					persons.add(person);
//				}
//			}
//		}

}
