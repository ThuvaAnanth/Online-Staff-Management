package com.sms.model;

public class Person {
	private static String firstName;
	private static String lastName;
	private static String email;
	
	public Person() {
		
	}
	
	public Person(String firstName, String lastName, String email) {
		Person.firstName = firstName;
		Person.lastName = lastName;
		Person.email = email;
	}
	
	public static String getFirstName() {
		return firstName;
	}

	public static void setFirstName(String firstName) {
		Person.firstName = firstName;
	}

	public static String getLastName() {
		return lastName;
	}

	public static void setLastName(String lastName) {
		Person.lastName = lastName;
	}

	public static String getEmail() {
		return email;
	}

	public static void setEmail(String email) {
		Person.email = email;
	}

}
