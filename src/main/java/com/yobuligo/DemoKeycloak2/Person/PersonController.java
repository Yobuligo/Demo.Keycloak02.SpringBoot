package com.yobuligo.DemoKeycloak2.Person;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@GetMapping("")
	public String GetEmpty() {
		return "";
	}
	
	@GetMapping("/persons")
	public ArrayList<Person> getPersons() {
		ArrayList<Person> personList = new ArrayList();
		Person person = new Person();
		person.setFirstname("Max");
		personList.add(person);
		return personList;
	}

}