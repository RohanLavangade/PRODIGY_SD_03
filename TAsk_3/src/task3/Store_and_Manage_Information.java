package task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Store_and_Manage_Information {

	private Map<String, Contact> contacts;

	public void ContactManager() {
	        contacts = new HashMap<>();
	    }

	public void addContact(String name, String phoneNumber, String email) {
		Contact contact = new Contact(name, phoneNumber, email);
		contacts.put(name, contact);
		System.out.println("Contact added successfully!");
	}

	public void viewContacts() {
		if (contacts.isEmpty()) {
			System.out.println("Contact list is empty.");
		} else {
			System.out.println("Contact List:");
			for (Contact contact : contacts.values()) {
				System.out.println(contact);
			}
		}
	}

	public void editContact(String name, String newPhoneNumber, String newEmail) {
		if (contacts.containsKey(name)) {
			Contact contact = contacts.get(name);
			contact.setPhoneNumber(newPhoneNumber);
			contact.setEmail(newEmail);
			System.out.println("Contact edited successfully!");
		} else {
			System.out.println("Contact not found.");
		}
	}

	public void deleteContact(String name) {
		if (contacts.containsKey(name)) {
			contacts.remove(name);
			System.out.println("Contact deleted successfully!");
		} else {
			System.out.println("Contact not found.");
		}
	}
}


